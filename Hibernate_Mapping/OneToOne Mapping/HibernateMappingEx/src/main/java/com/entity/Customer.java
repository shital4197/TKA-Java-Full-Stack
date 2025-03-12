package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerid;
	private String name;
	private String city;
	
	
	@OneToOne     // one to one realationship 
	Bike bikenumber;


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerid, String name, String city, Bike bikeno) {
		super();
		this.customerid = customerid;
		this.name = name;
		this.city = city;
		this.bikenumber = bikeno;
	}


	public int getCustomerid() {
		return customerid;
	}


	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public Bike getBikeno() {
		return bikenumber;
	}


	public void setBikeno(Bike bikeno) {
		this.bikenumber = bikeno;
	}


	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", name=" + name + ", city=" + city + ", bikeno=" + bikenumber + "]";
	}

}
