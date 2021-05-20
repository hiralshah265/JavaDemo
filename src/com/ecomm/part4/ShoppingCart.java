package com.ecomm.part4;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private static int instances = 0;

	private List<LineItem> products = new ArrayList<LineItem>();

	public ShoppingCart() {
		instances++;
	}

	public void addLineItem(Product product, int qty) {
		products.add(new LineItem(product, qty));
		printInstances();
	}

	public static void printInstances() {
		System.out.println("Instances till now" + instances);
	}

	public List<LineItem> getLineItems() {
		return products;
	}

	public List<LineItem> getCopyLineItems() {
		return new ArrayList<>(products);
	}

	List<LineItem> getCopyConstrLI() {
		List<LineItem> lineItemsCopy = new ArrayList<LineItem>();
		for (LineItem li : products) {
			lineItemsCopy.add(new LineItem(li));

		}
		return lineItemsCopy;
	}

	int getTotalCost() {
		int totalCost = 0;
		for (LineItem lI : products) {
			totalCost += lI.getPrice();
		}
		return totalCost;
	}

	@Override
	public String toString() {
		return "ShoppingCart [products=" + products + "]";
	}

}
