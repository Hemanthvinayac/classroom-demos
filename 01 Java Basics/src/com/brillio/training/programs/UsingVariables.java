package com.brillio.training.programs;

public class UsingVariables {
	public static void main(String[] args) {
		int num;
		num = 123;

		byte b1 = 126;

		float f1 = 1.3e-4f;
		float f2 = (float) 1.3;// first creates 8 bytes than reduce it to 4
								// bytes

		System.out.println("b1 is " + b1);
		System.out.println("num is " + num);
		System.out.println("f1 f2 = " + f1 + " " + f2);
	}
}
