package com.vrsa9208.designPatterns.structural.bridge;

public abstract class Shape {
	
	protected Color color;
	
	public Shape(Color color){
		this.color = color;
	}
	
	abstract public void applyColor();
}
