package com.brillio.training.excercise;

public class BinaryToDecimal {
	public static void main(String[] args) {
		int num = 10001, dec = 0;
		dec = calculateDecimal(num);
		System.out.println("Dec = " + dec);
	}

	private static int calculateDecimal(int num) {
		int i, temp = 0, count = 0;
		for (i = num; i > 0; i /= 10, count++) {
			temp += (i % 10) * Math.pow(2, count);
			System.out.println(temp);
		}
		return temp;
	}

}