package com.vrsa9208.designPatterns.behavioral.command;

//client
public class CommandDemo {

	public static void main(String[] args) {
		Light light = new Light();
		Switch lightSwitch = new Switch();
		
		Command toggleCommand = new ToggleCommand(light);
		
		lightSwitch.storeAndExecute(toggleCommand);
		lightSwitch.storeAndExecute(toggleCommand);
		lightSwitch.storeAndExecute(toggleCommand);
	}

}
