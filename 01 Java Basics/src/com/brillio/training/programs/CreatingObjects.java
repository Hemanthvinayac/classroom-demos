package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class CreatingObjects {

	public static void main(String[] args) {
		Person p1; // created a reference variable
		p1 = new Person();
		System.out.println(p1.name);
		System.out.println(p1.age);
	}
}
