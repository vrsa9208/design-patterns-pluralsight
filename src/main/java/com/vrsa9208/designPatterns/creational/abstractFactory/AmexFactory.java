package com.vrsa9208.designPatterns.creational.abstractFactory;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		
		switch(cardType) {
		case GOLD:
			return new AmexGoldCreditCard();
		case PLATINUM:
			return new AmexPlatinumCreditCard();
		default:
			break;
		}
		
		return null;
	}

	@Override
	public Validator getValidator() {
		// TODO Auto-generated method stub
		return null;
	}

}
