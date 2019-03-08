package com.vrsa9208.designPatterns.behavioral.mediator;

//receiver
public class Light {
	
	private String name;
	private boolean isOn;
	
	public Light(String name) {
		this.name = name;
		this.isOn = false;
	}
	
	public void toggle() {
		if(isOn) {
			off();
			isOn = false;
		}
		else {
			on();
			isOn = true;
		}
	}

	public void on() {
		System.out.println(name + " light switched on");
	}
	
	public void off() {
		System.out.println(name + " light switched off");
	}

	public boolean isOn() {
		return isOn;
	}
}
