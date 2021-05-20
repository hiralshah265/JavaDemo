package com.ecomm.part2;

public class LineItem {
	private Product product;
	private int quantity;
	
	LineItem(Product p, int qty){
		this.product = p;
		this.quantity = qty;
	}
	
//	public Product getProduct() {
//		return product;
//	}
//	public int getQuantity() {
//		return quantity;
//	}
	
	public int getPrice() {
		return product.getPrice() * quantity;
	}
	@Override
	public String toString() {
		return "LineItem [product=" + product + ", quantity=" + quantity + "]";
	}
	
	

}
