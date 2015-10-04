package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class Program06 {

	public static void main(String[] args) {
		
		Person p1 = new Person(121, "Robert Smith", "Chicago");
		Person[] persons = {
				new Person(),
				new Person(2233,"Ram Gopal","Madurai"),
				new Person(122,"Ram chandra", "Kovai"),
				p1
		};
	}
}
