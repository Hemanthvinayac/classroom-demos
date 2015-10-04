package com.brillio.training.programs;

import com.brillio.training.entity.Product;

public class ProductTest01 {

	public static void main(String[] args) {

		Product p1;
		p1 = new Product();

		p1.setId(23);
		p1.setName("Bisileri");
		p1.setDescription("mineral water");
		p1.setPrice(25.0);
		p1.setUnitsInStock(128);

		Product p2 = new Product(25, "chai", "A.K.A. Tea", 45, 300);
		
		System.out.println(p2);
		System.out.println(p1.toString());
	}
}
