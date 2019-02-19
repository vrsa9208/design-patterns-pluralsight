package com.vrsa9208.designPatterns.structural.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class MarvelApiFacadeImpl implements MarvelApiFacade {
	private final String PUBLIC_KEY = "871957f9168e77a049f738e2ab170436";
	private final String PRIVATE_KEY = "aff8be08be2eac984543274b1746a54e200c34a4";
	private final String BASE_URL = "http://gateway.marvel.com";

	@Override
	public List<String> getCharacters() {
		long timestamp = System.currentTimeMillis();
		String hash = getHash(timestamp);
		
		StringBuilder urlBuilder = new StringBuilder()
				.append(BASE_URL)
				.append("/v1/public/characters?ts=")
				.append(timestamp)
				.append("&apikey=")
				.append(PUBLIC_KEY)
				.append("&hash=")
				.append(hash);
		
		System.out.println(urlBuilder.toString());
		//System.out.println(getHTML(urlBuilder.toString()));
		
		//Make the request and parse the response
		return null;
	}

	private String getHash(long timestamp) {

		StringBuilder message = new StringBuilder().append(timestamp).append(PRIVATE_KEY).append(PUBLIC_KEY);

		return md5(message.toString());
	}

	private String md5(String message) {
		try {
			java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
			byte[] array = md.digest(message.getBytes());
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < array.length; ++i) {
				sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
			}
			return sb.toString();
		} catch (java.security.NoSuchAlgorithmException e) {
		}
		return null;
	}

	private String getHTML(String urlToRead) {
		try {
			StringBuilder result = new StringBuilder();
			URL url = new URL(urlToRead);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line;
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			rd.close();
			return result.toString();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

}
