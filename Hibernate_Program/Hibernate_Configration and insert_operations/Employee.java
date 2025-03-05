package com.tka;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	   @Id
		int e_id;
		String frist_name;
		String last_name;
		String city;
		String phone_no;
		String role;
		String salary;
		int exprience;
		
		public Employee() { 
			
		}

		public Employee(int e_id, String frist_name, String last_name, String city,         
				String phone_no, String role,String salary, int exprience)        
		{
			super();
			this.e_id = e_id;
			this.frist_name = frist_name;
			this.last_name = last_name;
			this.city = city;
			this.phone_no = phone_no;
			this.role = role;
			this.salary = salary;
			this.exprience = exprience;
		}
		
		public int getE_id() {
			return e_id;
		}

		public void setE_id(int e_id) {
			this.e_id = e_id;
		}

		public String getFrist_name() {
			return frist_name;
		}

		public void setFrist_name(String frist_name) {
			this.frist_name = frist_name;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getPhone_no() {
			return phone_no;
		}

		public void setPhone_no(String phone_no) {
			this.phone_no = phone_no;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getSalary() {
			return salary;
		}

		public void setSalary(String salary) {
			this.salary = salary;
		}

		public int getExprience() {
			return exprience;
		}

		public void setExprience(int exprience) {
			this.exprience = exprience;
		}

		@Override
		public String toString() {
			return "Employee [Employee_id=" + e_id + ", Frist_name=" + frist_name + ", Last_name=" + last_name + ", City=" + city
					+ ", Phone_no=" + phone_no + ", Role=" + role + ", Salary=" + salary + ", Exprience=" + exprience + "]";
		}	
}
