package com.entity;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Country {   // one to many
	
	@Id
	private int cid;
	private String name;
	
	@OneToMany
	private List<Employees> emp;

	public Country() {
		
	}

	public Country(int cid, String name, List<Employees> emp) {
		super();
		this.cid = cid;
		this.name = name;
		this.emp = emp;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employees> getEmp() {
		return emp;
	}

	public void setEmp(List<Employees> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Country [cid=" + cid + ", name=" + name + ", emp=" + emp + "]";
	}
	
}
