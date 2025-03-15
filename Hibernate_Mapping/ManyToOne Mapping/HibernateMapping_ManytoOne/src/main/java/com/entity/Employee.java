package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee { // many
	
	@Id
	private int eid;
	private String ename;
	
	@ManyToOne
	@JoinColumn(name = "emp")   // foreign key
	private Department dept;

	public Employee() {
		
	}

	public Employee(int eid, String ename, Department dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
	}

	public int getEid() {
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

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + "]";
	}

}
