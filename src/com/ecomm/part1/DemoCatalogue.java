package com.ecomm.part1;

public class DemoCatalogue {

	public static void main(String[] args) {
		Product dress = Catalogue.getProduct("Floral Summer Dress");
		Product shoes = Catalogue.getProduct("Wedges");
		
		ShoppingCart myCart = new ShoppingCart();
		myCart.addProduct(shoes);
		myCart.addProduct(dress);
		
		System.out.println(myCart);
		System.out.println("Total Cart Value : " + myCart.getTotalCost());
	}

}
