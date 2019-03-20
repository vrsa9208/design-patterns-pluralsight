package com.vrsa9208.designPatterns.behavioral.observer;

public abstract class Observer {
	protected Subject subject;
	abstract void update();
}
