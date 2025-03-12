package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bike {
	
	@Id
	private String bikeid;
	private String bikename;
	
	public Bike() {
		
	}
	
	public Bike(String bikeid, String bikename, String bikenumber) {
		super();
		this.bikeid = bikeid;
		this.bikename = bikename;
	}
	
	public String getBikeid() {
		return bikeid;
	}
	public void setBikeid(String bikeid) {
		this.bikeid = bikeid;
	}
	public String getBikename() {
		return bikename;
	}
	public void setBikename(String bikename) {
		this.bikename = bikename;
	}
	
	
	@Override
	public String toString() {
		return "Bike [bikeid=" + bikeid + ", bikename=" + bikename + "]";
	}

}
