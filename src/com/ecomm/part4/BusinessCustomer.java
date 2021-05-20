package com.ecomm.part4;

public class BusinessCustomer extends Customer {
	int size;
	

	BusinessCustomer(String name, long cardNumber, int size) {
		super(name, cardNumber);
		this.size = size;
	}

	public int getSize() {
		return this.size;
	}

	@Override
	public int calculateDiscount() {
		System.out.println("In Business Customer!");
		// int, ch, String
		int returnVal;
		switch (this.size) {
		case 1: //if(this.size ==1)
			returnVal = 10;
			break;
		case 2: //else if()
			returnVal = 15;
			break;
		case 3://else if()
			returnVal = 20;
			break;
		default://else
			returnVal = 0;

		}
		return returnVal;
	}

	@Override
	public String toString() {
		return super.toString() + "BusinessCustomer [size=" + size + "]";
	}
}
