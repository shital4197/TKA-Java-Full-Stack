package com.tka;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hospital {
		
	    @Id
		int hospital_id;
		String name;
		String city;
		String state;
		int doctors;
		int pateint;
		String departments;
		String email;
		String phone_no;
		
		public Hospital() {
			
		}

		public Hospital(int hospital_id, String name, String city, String state, int doctors, int pateint,
				String departments, String email, String phone_no) {
			super();
			this.hospital_id = hospital_id;
			this.name = name;
			this.city = city;
			this.state = state;
			this.doctors = doctors;
			this.pateint = pateint;
			this.departments = departments;
			this.email = email;
			this.phone_no = phone_no;
		}


		public int getHospital_id() {
			return hospital_id;
		}


		public void setHospital_id(int hospital_id) {
			this.hospital_id = hospital_id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getState() {
			return state;
		}


		public void setState(String state) {
			this.state = state;
		}


		public int getDoctors() {
			return doctors;
		}


		public void setDoctors(int doctors) {
			this.doctors = doctors;
		}


		public int getPateint() {
			return pateint;
		}


		public void setPateint(int pateint) {
			this.pateint = pateint;
		}


		public String getDepartments() {
			return departments;
		}


		public void setDepartments(String departments) {
			this.departments = departments;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPhone_no() {
			return phone_no;
		}


		public void setPhone_no(String phone_no) {
			this.phone_no = phone_no;
		}

		
		@Override
		public String toString() {
			return "Hospital [Hospital id = " + hospital_id + ", Name = " + name + ", City =" + city + ", State = " + state
					+ ", Doctors= " + doctors + ", Pateint= " + pateint + ", Departments= " + departments + ", Email = " + email
					+ ", Phone Number = " + phone_no + "]";
		}
		

	}


