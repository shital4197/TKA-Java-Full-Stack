package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Courses {
	
	@Id
	private int cid;
	private String cname;
	
	@ManyToMany
	@JoinTable(name = "course_student",        
    joinColumns = @JoinColumn(name = "course_id") ,
    inverseJoinColumns = @JoinColumn(name = "student_id")
	)
	
	private List <Students> std ;

	public Courses() {
		
	}

	public Courses(int cid, String cname, List<Students> std) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.std = std;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Students> getStd() {
		return std;
	}

	public void setStd(List<Students> std) {
		this.std = std;
	}

	@Override
	public String toString() {
		return "Courses [cid=" + cid + ", cname=" + cname + ", std=" + std + "]";
	}
}
