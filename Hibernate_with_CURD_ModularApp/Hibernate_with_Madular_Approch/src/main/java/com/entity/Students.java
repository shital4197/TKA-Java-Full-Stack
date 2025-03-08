package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_info")
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stdid;
	private String fname;
	private String lname;
	private String city;
	private String State;
	@Column(name = "contact")
	private String phonenumber;
	private String email;
	
	public Students() {
		
	}
	public Students(int stdid, String fname, String lname, String city, String state, String phonenumber,
			String email) {
		super();
		this.stdid = stdid;
		this.fname = fname;
		this.lname = lname;
		this.city = city;
		State = state;
		this.phonenumber = phonenumber;
		this.email = email;
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Students [stdid=" + stdid + ", fname=" + fname + ", lname=" + lname + ", city=" + city + ", State="
				+ State + ", phonenumber=" + phonenumber + ", email=" + email + "]";
	}

}
