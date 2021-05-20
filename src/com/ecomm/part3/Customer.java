package com.ecomm.part3;

public class Customer {
	private final String name;
	private CreditCard card;

	Customer(String name, long cardNumber) {
		this.name = name;
		this.card = new CreditCard(cardNumber);
	}

	public Order checkout(ShoppingCart myCart) {
		Payment p = card.makePayment(myCart.getTotalCost());
		return new Order(this, myCart, p);
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", card=" + card + "]";
	}

}
