package com.ecomm.part2;

public class Demo {

	public static void main(String[] args) {

		int x =0;
		
		final ShoppingCart myCart = new ShoppingCart();
		myCart.addLineItem(Catalogue.getProduct("Floral Summer Dress"), 1);
		myCart.addLineItem(Catalogue.getProduct("EBook"), 1);
		System.out.println(myCart);
		System.out.println("Total Cart Value : " + myCart.getTotalCost());

		Customer cust1 = new Customer("Anita", 1234567812345678L);
		Order myOrder = cust1.checkout(myCart);// Instance
		cust1.name = "hello i am messing with the name because you made it public";
		System.out.println(myOrder);
		System.out.println(Customer.noOfCustomers); //CLASS NAME.static 
		
		Customer.controlNumer();
	}

}
