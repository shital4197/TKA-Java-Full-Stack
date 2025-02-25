package com.statementsexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Car {
       // Statement interface by using the maven 
	public void insertData() throws Exception{ // Inserted Data
		
		Class.forName("com.mysql.cj.jdbc.Driver"); // Register and loading the Driver
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204db","root","root"); // get connections
		Statement s = c.createStatement();  // create statements
		s.executeUpdate("insert into car values(4,'Luxury SUV','White','BMW X5 ','35 lakh')");  // sql query
		System.out.println("Inserted Data Successfully!..."); // print
		c.close();
	
	}

	public void updateData() throws Exception{   // Updated Data
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204db","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("Update car set color = 'Gray' where id = 3");
		System.out.println("Updataed Data Successfully!...");
		c.close();
		
	}

	public void deleteData() throws Exception {  // Deleted Data
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204db","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from car where id = 2");
		System.out.println("Deleted Data Successfully!...");
		c.close();
		
	}

	public void DisplayAllData() throws Exception { // Display Data
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204db","root","root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from Car");
		System.out.println("Display All Data!...");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ "  " +"Car name is " + " "+rs.getString(2)+" color is "+ rs.getString(3)+ " " +"model "+ rs.getString(4)+" and price is "+rs.getString(5));
		
		}
		
	}

}
