package com.jdbcstatement;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AnimalEx {
	
	public static void insertData() throws Exception {  // inserted the data 
		
		Class.forName("com.mysql.cj.jdbc.Driver"); // register and load the class driver
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root"); // get connection
		Statement s = c.createStatement(); // statements
//		s.executeUpdate("insert into animal_info values(1,'Dog')");
		s.executeUpdate("insert into animal_info values(2,'Cat'),(3,'Monkey'),(4,'Lion'),(5,'Cow')");

		System.out.println("Data inserted successfully!...");

		c.close();	
	}
	
	public static void updateData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root" , "root");
		Statement s = c.createStatement();
		s.executeUpdate("update animal_info set name = 'Tiger' where id = 4");
		System.out.println("Updated Successfully!...");
		c.close();
	}
	
	public static void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from animal_info where id = 1");
		System.out.println("Deleted Successfully!........");
		c.close();
	}
	
	public static void getallData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		Statement s = c.createStatement();
		ResultSet r = s.executeQuery("select*from animal_info");
		System.out.println("Get all the data of Animal ");
		while(r.next()) {
			System.out.println(r.getInt(1)+" "+ r.getString(2));
		}
		
		c.close();
	}
	public static void main(String[] args) throws Exception{
		AnimalEx c = new AnimalEx();
//		c.insertData();
//		c.updateData();
//		c.deleteData();
		c.getallData();
	}

}
