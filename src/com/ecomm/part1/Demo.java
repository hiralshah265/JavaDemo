package com.ecomm.part1;

public class Demo {

	public static void main(String[] args) {
		Product dress = new Product("Floral Summer Dress", 599);
		Product shoes = new Product("Wedges", 399);
		
		ShoppingCart myCart = new ShoppingCart();
		myCart.addProduct(shoes);
		myCart.addProduct(dress);
		
		System.out.println(myCart);
		System.out.println("Total Cart Value : " + myCart.getTotalCost());
	}

}
