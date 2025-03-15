package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {    // one 
	
	@Id
	private int did;
	private String dname;
	
	@OneToMany
	private List<Employee> emp;
	

	public Department() {
		
	}


	public Department(int did, String dname, List<Employee> emp) {
		super();
		this.did = did;
		this.dname = dname;
		this.emp = emp;
	}


	public int getDid() {
		return did;
	}


	public void setDid(int did) {
		this.did = did;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public List<Employee> getEmp() {
		return emp;
	}


	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}


	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", emp=" + emp + "]";
	}

}
