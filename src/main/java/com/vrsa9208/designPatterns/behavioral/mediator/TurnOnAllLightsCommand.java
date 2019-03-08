package com.vrsa9208.designPatterns.behavioral.mediator;

public class TurnOnAllLightsCommand implements Command {
	
	Mediator med;
	
	public TurnOnAllLightsCommand(Mediator med) {
		this.med = med;
	}

	@Override
	public void execute() {
		med.turnOnAllLights();
	}

}
