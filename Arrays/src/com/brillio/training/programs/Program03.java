package com.brillio.training.programs;

public class Program03 {

	public static void main(String[] args) {
	
		//array of 4 strings
		String[] names = {"Jones","Miller","Scott","Allen"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		System.out.println(" ");
		//enhanced for loop(for-each loop)
		//introduced in Java 1.5
		
		for (String name : names) {
			System.out.println(name);
		}
	}
}
