package com.jdbcstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Person {
	
	public static void insertData() throws Exception {  // inserted the data 
		
		Class.forName("com.mysql.cj.jdbc.Driver"); // register and load the class driver
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root"); // get connection
		Statement s = c.createStatement(); // statements
//		s.executeUpdate("insert into person values(1,'Karan','Pune')"); // write the query
		s.executeUpdate("insert into person values(2,'Ram','Nashik'),(3,'Kiran','Mumbai'),(4,'Sagar','Thane')");
		System.out.println("Data inserted successfully!...");  // print the message 
		c.close(); // close the all connection
	}
	
	public static void updateData() throws Exception{  // updated the data 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection  c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("Update person set name = 'Om' where id = 4");
		System.out.println("Updated Data Successfully!...");
		c.close();
		}
	public static void deleteData() throws Exception{  // delete the data 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection  c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from person where id = 1");
		System.out.println("Deleted Data Successfully!...");
		c.close();
		}
	
	public static void getallData() throws Exception{ // getallData
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		Statement s = c.createStatement();
        ResultSet rs = s.executeQuery("Select * from person");
		
		System.out.println(" all the data of persons : ");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+" "+ rs.getString(3));
		}
		
		c.close();
		
	}

	
	public static void main(String[] args) throws Exception {
		
		Person p  = new Person();
//		p.insertData();
//		p.updateData();
//		p.deleteData();
		p.getallData();
	}

}
