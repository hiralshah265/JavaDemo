package com.ecomm.part4;

public abstract class PhysicalProduct extends AbstractProduct {
	float weight;

	PhysicalProduct(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateFinalPrice(int x, String y) {
		return (int) (weight * super.getPrice());
	}

}
