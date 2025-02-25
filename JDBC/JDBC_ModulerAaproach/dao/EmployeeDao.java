package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDao {
	
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into employee_info values(104,'Raj',25000,8896587489)");
		System.out.println("Inserted !..");
	    c.close();
	}
	
	public void updateData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("update employee_info set name = 'Madhura' where id = 104");
	    System.out.println("Updated!...");
	    c.close();
	}

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from employee_info where id = 103");
		System.out.println("Deleted!...");
		c.close();
		
	}

	public void getallData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select*from employee_info");
		System.out.println("Show all data!..");
	    while(rs.next()) {
	    	System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+ " "+ rs.getInt(3)+" "+rs.getString(4));
	    }
	}
}
