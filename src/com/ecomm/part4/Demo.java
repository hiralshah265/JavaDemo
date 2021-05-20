package com.ecomm.part4;

public class Demo {

	public static void main(String[] args) {

		Shoes s = new Shoes("sneakers", 20);
		System.out.println(s.getPrice());
	}

}

class Dummy {
	int x, y;

	Dummy() {
		x = 0;
		y = 0;
	}

	Dummy(int x) {
		this.x = x;
	}

	Dummy(int x, int y) {
		this.y = y;
	}
}