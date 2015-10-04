package com.brillio.training.programs;

import com.brillio.training.entity.Address;
import com.brillio.training.entity.Customer;

public class Program01 {

		public static void main(String[] args) {
			Customer c1 = new Customer(77888,"Jhon","Deo");
			Address a1 = new Address("1st cross, ist main", "Jayanagr","Bangalore","KA","India");
			c1.setAddress(a1);
			c1.print();
		}
}
