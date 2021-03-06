package com.vrsa9208.designPatterns.behavioral.templateMethod;

public class StoreOrder extends OrderTemplate {

	@Override
	public void doCheckout() {
		System.out.println("Doing checkout");
	}

	@Override
	public void doPayment() {
		System.out.println("Doing payment");
	}

	@Override
	public void doReceipt() {
		System.out.println("Doing receipt");
	}

	@Override
	public void doDelivery() {
		System.out.println("Doing delivery to store");
	}

}
