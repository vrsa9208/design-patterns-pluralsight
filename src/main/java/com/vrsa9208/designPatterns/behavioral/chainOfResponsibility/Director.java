package com.vrsa9208.designPatterns.behavioral.chainOfResponsibility;

public class Director extends Handler {

	@Override
	public void handleRequest(Request request) {
		// TODO Auto-generated method stub
		if(request.getRequestType() == RequestType.CONFERENCE) {
			System.out.println("Directors can approve conferences");
		}
		else {
			successor.handleRequest(request);
		}
	}

}
