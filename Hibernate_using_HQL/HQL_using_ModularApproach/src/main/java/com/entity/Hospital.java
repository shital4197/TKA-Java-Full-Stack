package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Hospital_info")
public class Hospital {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hospitalid;
	private String name;
	private String city;
	private String state;
	private String email;
	@Column(name = "contact")
	private String phone;
	
	public Hospital() {   // constructor with no arg
	
	}

	public Hospital(int hospitalid, String name, String city, String state, String email, String phone)  // constructor with arg
	{    
		super();
		this.hospitalid = hospitalid;
		this.name = name;
		this.city = city;
		this.state = state;
		this.email = email;
		this.phone = phone;
	}

	public int getHospitalid() {    // geter and seter method
		return hospitalid;
	}

	public void setHospitalid(int hospitalid) {
		this.hospitalid = hospitalid;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	@Override
	public String toString() {      // to string method 
		
		return "Hospital [hospitalid=" + hospitalid + ", name=" + name + ", city=" + city + ", state=" + state
				+ ", email=" + email + ", phone=" + phone + ", getHospitalid()=" + getHospitalid() + ", getName()="
				+ getName() + ", getCity()=" + getCity() + ", getState()=" + getState() + ", getEmail()=" + getEmail()
				+ ", getPhone()=" + getPhone() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
