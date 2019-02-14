package com.vrsa9208.designPatterns.structural.bridge;

public class Shape1BridgeDemo {

	public static void main(String[] args) {
		
		Blue blue = new Blue();
		Circle circle = new Circle(blue);
		
		Red red = new Red();
		Square square = new Square(red);
		
		circle.applyColor();
		square.applyColor();
	}

}
