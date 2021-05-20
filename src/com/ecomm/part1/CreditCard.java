package com.ecomm.part1;

public class CreditCard {
	private final long cardNumber;

	public CreditCard(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + "]";
	}

}
