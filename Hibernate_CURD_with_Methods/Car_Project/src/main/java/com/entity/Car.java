package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity    // connection between classes and databases
@Table(name = "CarRecord")    // change the table name
public class Car {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)  // auto increament 
		int car_id;
		String name;
		String color;
		@Column(name = "speed")    // change the field name
		String model;
		String company;
		String price;
		
		public Car() {
			
		}

		public Car(int car_id, String name, String color, String model, String company, String price) {
			super();
			this.car_id = car_id;
			this.name = name;
			this.color = color;
			this.model = model;
			this.company = company;
			this.price = price;
		}

		public int getCar_id() {
			return car_id;
		}

		public void setCar_id(int car_id) {
			this.car_id = car_id;
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

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Car [Car_id=" + car_id + ", Name=" + name + ", Color=" + color + ", Model=" + model + ", Company="
					+ company + ", Price=" + price + "]";
		}
		
	}


