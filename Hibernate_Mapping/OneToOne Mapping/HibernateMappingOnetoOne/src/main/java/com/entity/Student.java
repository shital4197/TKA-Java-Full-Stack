package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stdid;
	private String stdname;
	
	@OneToOne
	Laptop lap;   // referance 

	public Student() {
		
	}

	public Student(int stdid, String stdname, Laptop lap) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.lap = lap;
	}

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdname=" + stdname + ", lap=" + lap + "]";
	}
	
}
