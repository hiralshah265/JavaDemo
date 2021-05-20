package com.ecomm.part3;

import java.util.HashMap;
import java.util.Map;

public class Catalogue {
	public static Map<String, Product> products = new HashMap<String, Product>();
	public static final int SHIPPING_COST = 5;

	static {
		products.put("Wedges", new Product("Wedges", 699, ProductType.PHYSHICAL, 450));
		products.put("Floral Summer Dress", new Product("Floral Summer Dress", 799, ProductType.PHYSHICAL, 200));
		products.put("EBook", new Product("EBook", 2000, ProductType.DIGITAL, -1));
	}

	public static Product getProduct(String key) {
		return products.get(key);
	}
}
