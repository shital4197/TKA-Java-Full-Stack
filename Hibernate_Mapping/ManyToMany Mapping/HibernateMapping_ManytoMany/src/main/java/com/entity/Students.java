package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Students {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String city;
	private String state;
	
	@ManyToMany
	@JoinTable(name = "student_course",                      // Name of the join table
		      joinColumns = @JoinColumn(name = "student_id"),   // FK for students
		      inverseJoinColumns = @JoinColumn(name = "course_id") // FK for course
       )
	private List<Courses> course;
	
	public Students() {   // constructor
	
	}

	public Students(int id, String name, String city, String state, List<Courses> course) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<Courses> getCourse() {
		return course;
	}

	public void setCourse(List<Courses> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", city=" + city + ", state=" + state + ", course=" + course
				+ "]";
	}
}
