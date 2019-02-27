package com.vrsa9208.designPatterns.behavioral.command;


//invoker
public class Switch {

	public void storeAndExecute(Command command) {
		command.execute();
	}
}
