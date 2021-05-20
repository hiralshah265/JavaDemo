package com.ecomm.part4;

public abstract class DigitalProduct extends AbstractProduct {

	DigitalProduct(String name, int price) {
		super(name, price);
	}

	public abstract int calculateFinalPrice(int x, String y) ;
	

}
