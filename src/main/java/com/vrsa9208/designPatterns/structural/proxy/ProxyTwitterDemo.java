package com.vrsa9208.designPatterns.structural.proxy;

public class ProxyTwitterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwitterService service = (TwitterService)SecurityProxy.newInstance(new TwitterServiceStub());
		
		System.out.println(service.getTimeline("whatever"));
		service.postToTimeline("whatever", "Some new post");
	}

}
