package com.ecomm.part1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Product> products = new ArrayList<Product>();
	
	public ShoppingCart() {
		
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	
	int getTotalCost() {
		
		int totalCost = 0;
		for(Product p : products) {
			totalCost+=p.getPrice();
		}
		return totalCost;
	}

	@Override
	public String toString() {
		return "ShoppingCart [products=" + products + "]";
	}
	
}
