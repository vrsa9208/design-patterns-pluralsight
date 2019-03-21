package com.vrsa9208.designPatterns.behavioral.state;

public class FanHighState extends State {

	private Fan fan;

	public FanHighState(Fan fan) {
		this.fan = fan;
	}

	@Override
	public void handleRequest() {
		System.out.println("Turning fan on to off");
		fan.setState(fan.getFanOffState());
	}

	@Override
	public String toString() {
		return "Fan is high";
	}
}
