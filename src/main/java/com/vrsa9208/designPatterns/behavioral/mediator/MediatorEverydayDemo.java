package com.vrsa9208.designPatterns.behavioral.mediator;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class MediatorEverydayDemo {
	
	private Toolkit toolkit;
	private Timer timer;
	
	public MediatorEverydayDemo(int seconds) {
		timer = new Timer();
		toolkit = Toolkit.getDefaultToolkit();
		
		timer.schedule(new RemindTask(), seconds * 1000);
		timer.schedule(new RemindTaskWithoutBeep(), seconds * 2 * 1000);
	}

	public static void main(String[] args) {
		new MediatorEverydayDemo(1);
	}
	
	class RemindTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("Time's up");
			toolkit.beep();
		}
		
	}

	class RemindTaskWithoutBeep extends TimerTask {

		@Override
		public void run() {
			System.out.println("Now Time's really up");
			timer.cancel();
		}
		
	}
}


