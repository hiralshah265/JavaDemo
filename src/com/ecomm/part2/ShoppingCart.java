package com.ecomm.part2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<LineItem> products = new ArrayList<LineItem>();

	public ShoppingCart() {

	}

	public void addLineItem(Product product, int qty) {
		products.add(new LineItem(product, qty));

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
