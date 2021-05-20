package com.ecomm.part4;

public abstract class AbstractProduct {
	private String name;
	private int price;
	int discount;

	AbstractProduct(String name, int price) {
		this.name = name;
		this.price = price;
		this.discount = 0;
	}

	AbstractProduct(String name, int price, int discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}

	public int getPrice() {
		return calculateFinalPrice(0, "");
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

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	public abstract int calculateFinalPrice(int x, String y);

}
