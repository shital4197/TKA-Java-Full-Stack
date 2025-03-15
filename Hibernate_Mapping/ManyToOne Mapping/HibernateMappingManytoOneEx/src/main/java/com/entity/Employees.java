package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employees {    // many to one
	
	@Id
	private int eid;
	private String ename;
	
	@ManyToOne
	@JoinColumn(name = "countryid")    // foreign key
	private Country cuntry;
	
	public Employees() {    // constructor with no argument
		
	}

	public Employees(int eid, String ename, Country cuntry) {  // constructor with argument
		super();
		this.eid = eid;
		this.ename = ename;
		this.cuntry = cuntry;
	}

	public int getEid() {     // getter and setter method
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Country getCuntry() {
		return cuntry;
	}

	public void setCuntry(Country cuntry) {
		this.cuntry = cuntry;
	}

	@Override
	public String toString()    // to string method
	{       
		return "Employees [eid=" + eid + ", ename=" + ename + ", cuntry=" + cuntry + "]";
	}

}
