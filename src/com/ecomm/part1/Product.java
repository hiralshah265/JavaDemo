package com.ecomm.part1;

public class Product {
	private final String name;
	private int price;
	
	Product(String name, int price){
		this.name = name;
		this.price= price;
	}
	
	public int getPrice(){
		return price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

}
