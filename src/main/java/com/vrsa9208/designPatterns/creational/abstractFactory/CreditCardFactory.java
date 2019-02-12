package com.vrsa9208.designPatterns.creational.abstractFactory;

public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		
		if(creditScore > 650) {
			return new AmexFactory();
		} else {
			return new VisaFactory();
		}
	}
	
	public abstract CreditCard getCreditCard(CardType cardType);
	
	public abstract Validator getValidator();
}
