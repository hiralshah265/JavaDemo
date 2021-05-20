package com.ecomm.part4;

public class TestClass {
	public static void main(String[] args) {

		Customer c1 = new Customer("Hannah", 1234L);
		BusinessCustomer c2 = new BusinessCustomer("Ben", 5678L, 3);
		SmallBusinessCustomer c3 = new SmallBusinessCustomer("Hiral", 2345L, 1);

		Customer c4 = new BusinessCustomer("Suraj", 9999L, 2);
		System.out.println(c4);
		c4.calculateDiscount();

//		c2.calculateDiscount();
//		c3.calculateDiscount();

	}

}
