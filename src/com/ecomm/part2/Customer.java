package com.ecomm.part2;

public class Customer {
	public static int noOfCustomers = 0;
	
	public  String name;
	private CreditCard card;

	Customer(String name, long cardNumber) {
		noOfCustomers++;
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
	
	public static void controlNumer() {
		if( noOfCustomers > 10) {
			System.out.println("Too many customers!");
		}
	}

}
