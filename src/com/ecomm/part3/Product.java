package com.ecomm.part3;

public class Product {

	private final String name;
	private int price;
	int discount;
	float weight;
	private ProductType type;

	Product(String name, int price, ProductType type) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.discount = 0;
	}

	Product(String name, int price, ProductType physhical, int discount) {
		this.name = name;
		this.price = price;
		this.type = physhical;
		this.discount = discount;
	}

	Product(String name, int price, ProductType type, float weight) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.discount = 0;
		this.weight = weight;
	}

	Product(String name, int price, ProductType type, int discount, float weight) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.discount = discount;
		this.weight = weight;
	}

	public int getPrice() {
		return calculateFinalPrice();
	}
//Discounted price
//	public int getPrice() {
//		return (int)(price * (100-discount)/100) ;
//	}

// Price with shipping included
//	public int getPrice() {
//		int shippingCost = 0;
//		
//		if (type == ProductType.PHYSHICAL) {
//			shippingCost = (int) (weight * Catalogue.SHIPPING_COST);
//		}
//
//		return (int) (price * (100 - discount) / 100) + shippingCost;
//	}

//	public int getPrice() {
//		int shippingCost = type.getShippingCost();
//		
//		return (int) (price * (100 - discount) / 100) + shippingCost;
//	}

	public ProductType getProductType() {
		return this.type;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "Product type" + type + "]";
	}

	private int calculateFinalPrice() {
		// Do complex cail to
		return (int) (price * (100 - discount) / 100) + 5;

	}
}
