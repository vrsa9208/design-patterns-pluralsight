package com.vrsa9208.designPatterns.behavioral.mediator;

public class TurnOffAllLightsCommand implements Command {

	Mediator med;

	public TurnOffAllLightsCommand(Mediator med) {
		this.med = med;
	}

	@Override
	public void execute() {
		med.turnOffAllLights();
	}

}
