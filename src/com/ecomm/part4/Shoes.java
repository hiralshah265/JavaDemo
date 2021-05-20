package com.ecomm.part4;

public class Shoes extends PhysicalProduct {
	double size;
	String colour;

	Shoes(String name, int price) {
		super(name, price);
		size = 5.5;
		colour = "black";
	}

	
}
