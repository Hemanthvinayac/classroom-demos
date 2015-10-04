package com.brillio.training.excercise02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {

	private int customerId;
	private String customerName;
	private Date birthDate;
	private String city;
	
	public Customer() {
	}

	

	public Customer(int customerId, String customerName, String date, String city) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.birthDate = stringToDate(date);
		this.city = city;
	}

	

	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public Date getDate() {
		return birthDate;
	}



	public void setDate(String date) {
		this.birthDate = stringToDate(date);
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	private static Date stringToDate(String input) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return sdf.parse(input);
		} catch (ParseException e) {
			return null;
		}
	}

}
