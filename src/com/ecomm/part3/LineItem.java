package com.ecomm.part3;

public class LineItem {
	private Product product;
	private int quantity;
	
	LineItem(Product p, int qty){
		this.product = p;
		this.quantity = qty;
	}
	
	LineItem(LineItem li){
		this(li.product, li.quantity);
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

	public int getQty() {
		return quantity;
	}

	public void setQty(int i) {
		this.quantity = i;
	}
	
	

}
