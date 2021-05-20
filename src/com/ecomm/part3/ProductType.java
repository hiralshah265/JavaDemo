package com.ecomm.part3;

public enum ProductType {
	PHYSHICAL(Catalogue.SHIPPING_COST), DIGITAL(0);
	
	private int shippingRate;
	
	ProductType(int shippingRate){
		this.shippingRate = shippingRate;
	}
	
	int getShippingCost(int weight) {
		return shippingRate * weight;
	}
}
