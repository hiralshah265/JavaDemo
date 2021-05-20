package com.ecomm.part3;

import java.util.UUID;

public class CreditCard {
	private final long cardNumber;

	public CreditCard(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Payment makePayment(int value) {
		return new Payment(this, value, UUID.randomUUID());
		
	}
	@Override
	public String toString() {
		return "CreditCard [cardNumber=" + cardNumber + "]";
	}

}
