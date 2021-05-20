package com.ecomm.part2;

import java.util.HashMap;
import java.util.Map;

public class Catalogue {
	public static Map<String, Product> products = new HashMap<String, Product>();
	int var=5;

	static {
		products.put("Wedges", new Product("Wedges", 699, ProductType.PHYSHICAL));
		products.put("Floral Summer Dress", new Product("Floral Summer Dress", 799, ProductType.PHYSHICAL));
		products.put("EBook", new Product("EBook", 2000, ProductType.DIGITAL));
	}
	
	public static Product getProduct(String key) {
		return products.get(key);
	}
}
