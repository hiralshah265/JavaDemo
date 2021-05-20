package com.ecomm.part2;

public class Product {
	private final String name;
	private int price;
	private ProductType type;
	
	Product(String name, int price, ProductType type){
		this.name = name;
		this.price= price;
		this.type = type;
	}
	
	public int getPrice(){
		return price;
	}

	public ProductType getProductType() {
		return this.type;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "Product type"+ type + "]";
	}

}
