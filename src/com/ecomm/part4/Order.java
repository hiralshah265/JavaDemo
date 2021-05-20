package com.ecomm.part4;

public class Order {
	private Customer cust;
	private ShoppingCart myCart;
	private Payment payment;
	
	Order(Customer c, ShoppingCart myCart, Payment p ){
		this.cust = c;
		this.myCart = myCart;
		this.payment = p;
	}

	@Override
	public String toString() {
		return "Order [cust=" + cust + ", myCart=" + myCart + "Payment" + payment+ "]";
	}

	public ShoppingCart getCart() {
		return myCart;
	}
	
	
}
