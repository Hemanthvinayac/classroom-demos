package com.brillio.training.programs;

import com.brillio.training.entity.Television;

public class Progarm03 {

	public static void main(String[] args) {
		
		Television tv1 = new Television();
		tv1.setProductId(12);
		tv1.setProductName("Sony Bravia");
		tv1.setUnitPrice(99990.0);
		tv1.setSize(32);
		tv1.setScreenType("TFT");
		System.out.println(tv1);
	}
}
