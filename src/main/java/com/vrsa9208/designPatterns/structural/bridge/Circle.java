package com.vrsa9208.designPatterns.structural.bridge;

public class Circle extends Shape {

	public Circle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		color.applyColor();
	}

}
