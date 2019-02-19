package com.vrsa9208.designPatterns.structural.facade;

public class FacadeDemo {
	public static void main(String[] args) {
		MarvelApiFacade marvelApiFacade = new MarvelApiFacadeImpl();
		
		marvelApiFacade.getCharacters();
	}
}
