package com.ecomm.part2;

import java.util.UUID;

public class Payment {
	private CreditCard card;
	private int totalCost;
	private UUID paymentID;

	public Payment(CreditCard creditCardPayment, int value, UUID randomUUID) {
		this.card = creditCardPayment;
		this.totalCost = value;
		this.paymentID = randomUUID;

	}

	@Override
	public String toString() {
		return "Payment [card=" + card + ", totalCost=" + totalCost + ", paymentID=" + paymentID + "]";
	}

}
