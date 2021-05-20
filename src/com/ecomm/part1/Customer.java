package com.ecomm.part1;

public class Customer {
	private final String name;
	private CreditCard card;
	
	Customer(String name, long cardNumber){
		this.name = name;
		this.card = new CreditCard(cardNumber);
	}
	
	Customer(String name){
		this.name = name;
		this.card = null;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", card=" + card + "]";
	}

}
