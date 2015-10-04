package com.brillio.training.programs;

import com.brillio.training.entity.Person;

public class Progam05 {

	public static void main(String[] args) {
	
		//persons is not a reference to a Person object
		//but it s a reference to an array of Person objects
		Person[] persons;
		
		persons = new Person[3];
		persons[0] = new Person(1,"Vinod", "Bangalore");
		persons[1] = new Person(2,"Hemanth", "Bengaluru");
		persons[2] = new Person(3,"Vinay", "Bangalore");
				
		for (Person p1 : persons) {
			System.out.println(p1);
		}
	}
}
