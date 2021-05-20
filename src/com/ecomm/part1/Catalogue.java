package com.ecomm.part1;

import java.util.HashMap;
import java.util.Map;

public class Catalogue {
	public static Map<String, Product> products = new HashMap<String, Product>();

	static {
		products.put("Wedges", new Product("Wedges", 699));
		products.put("Floral Summer Dress", new Product("Floral Summer Dress", 799));
	}
	
	public static Product getProduct(String key) {
		return products.get(key);
	}
}
