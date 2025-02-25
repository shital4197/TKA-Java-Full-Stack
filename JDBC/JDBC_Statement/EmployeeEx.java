package com.jdbcstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeEx {
	
	public static void insertData() throws Exception {  // inserted the data 
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		Statement s = c.createStatement();
//		s.executeUpdate("insert into employees values(1,'Komal',20000,'Pune')");
		s.executeUpdate("insert into employees values(2,'Sagar',22000,'Mumbai'),(3,'Karan',30000,'Nashik'),"
				+ "(4,'Shalini',25000,'Thane'),(5,'Ravi',32000,'Chinchwad')");
		System.out.println("Inserted Successully!..");
		c.close();
	}
	
	public static void updateData() throws Exception {  // updated the Data
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("update employees set name = 'Rohit' where id = 5");
		System.out.println("Update Data Successfully");
		c.close();
	}
	
	public static void deleteData() throws Exception{ // deleted the data 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c  = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		Statement s = c.createStatement();
		s.execute("delete from employees where id = 1");
		System.out.println("Deleted Data Successfully!....");
		c.close();
	}
	
	public static void getallData() throws Exception{  // getall the data
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c  = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("Select * from employees");
		
		System.out.println(" all the data Employees : ");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " "+ rs.getInt(3) + " "+ rs.getString(4) );
		}
	
		c.close();
	}

	
	public static void main(String[] args) throws Exception {  // main method 
		EmployeeEx e = new EmployeeEx();
//		e.insertData();
//		e.updateData();
//		e.deleteData();
		e.getallData();
		
	}

}
