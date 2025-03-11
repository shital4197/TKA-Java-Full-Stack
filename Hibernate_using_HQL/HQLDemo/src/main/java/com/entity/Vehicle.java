package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Vehicle_info")
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vid;
	@Column(name = "Vname")
	private String name;
	private String color;
	
	public Vehicle() {
	
	}
	public Vehicle(int vid, String name, String color) {
		super();
		this.vid = vid;
		this.name = name;
		this.color = color;
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Vehicale [vid=" + vid + ", name=" + name + ", color=" + color + ", getVid()=" + getVid()
				+ ", getName()=" + getName() + ", getColor()=" + getColor() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
