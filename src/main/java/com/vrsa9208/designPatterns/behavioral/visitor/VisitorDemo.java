package com.vrsa9208.designPatterns.behavioral.visitor;

public class VisitorDemo {

	public static void main(String[] args) {
		PartsOrder order = new PartsOrder();
		order.addPart(new Wheel());
		order.addPart(new Fender());
		order.addPart(new Oil());
		
		double shippingCost = order.calculateShipping();
		System.out.println(shippingCost);
	}
}
