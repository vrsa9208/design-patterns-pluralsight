package com.vrsa9208.designPatterns.behavioral.strategy;

public class StrategyDemo {

	public static void main(String[] args) {
		CreditCard amexCard = new CreditCard(new AmexStrategy());
		
		amexCard.setNumber("379185883464283");
		amexCard.setDate("04/2020");
		amexCard.setCvv("123");
		
		System.out.println("Is amex valid: " + amexCard.isValid());

		CreditCard amexCard2 = new CreditCard(new AmexStrategy());
		
		amexCard2.setNumber("379185883464282");
		amexCard2.setDate("04/2020");
		amexCard2.setCvv("234");
		
		System.out.println("Is amex valid: " + amexCard2.isValid());
		
		CreditCard visaCard = new CreditCard(new VisaStrategy());
		visaCard.setNumber("4012888888881881");
		visaCard.setDate("04/2020");
		visaCard.setCvv("234");
		
		System.out.println("Is visa valid: " + visaCard.isValid());
	}

}
