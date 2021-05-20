package com.ecomm.part3;

import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {

		ShoppingCart myCart = new ShoppingCart();
		myCart.addLineItem(Catalogue.getProduct("Wedges"), 2);
		myCart.addLineItem(Catalogue.getProduct("Floral Summer Dress"), 1);
		myCart.addLineItem(Catalogue.getProduct("EBook"), 1);
		System.out.println(myCart);
		System.out.println("Total Cart Value : " + myCart.getTotalCost());

		Customer cust1 = new Customer("Anita", 1234567812345678L);
		Order myOrder = cust1.checkout(myCart);
		System.out.println(myOrder);
		fulfillDefensiveCopy(myOrder);
		System.out.println(myOrder);

	}

	public static void fulfill(Order o) {
		ShoppingCart c = o.getCart();
		Iterator<LineItem> it = c.getLineItems().iterator();

		while (it.hasNext()) {
			LineItem li = it.next();
			if (Math.random() > 0.7) {
				System.out.println("Item is out of stock : " + li);
			} else {
				//Do something to ship it
				it.remove();
			}

		}

	}

	public static void fulfillDefensiveCopy(Order o) {
		ShoppingCart c = o.getCart();
		boolean outOfStock = false;
//		Iterator<LineItem> it = c.getCopyLineItems().iterator();
		 Iterator<LineItem> it = c.getCopyConstrLI().iterator();
		
		while (it.hasNext() && !outOfStock) {
			LineItem li = it.next();
			if (Math.random() > 0.7) {
				outOfStock = true;
				li.setQty((int) li.getQty() / 2);
			} else {
				li.setQty(0);
			}

		}

	}
}
