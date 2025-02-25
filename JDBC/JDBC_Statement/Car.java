package com.jdbcstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Car {
	
	public static void insertdata() throws Exception { // inserted data
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into car_info values(101,'Toyota','White'),(102,'BMW','Blue'),"
				+ "(103,'Thar','black'),(104,'Honda CR','Gray'),(101,'Tesla Model Y','Red')");
		System.out.println("Data inserted successfully!...");
		
		c.close();	
	}
	
	public static void updateData() throws Exception {  // updated the Data
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("update car_info set id = 101 where color = 'red'");
		System.out.println("Update Data Successfully");
		c.close();
	}
	
	public static void deleteData() throws Exception{ // deleted the data 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c  = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		Statement s = c.createStatement();
		s.execute("delete from car_info where id = 101 ");
		System.out.println("Deleted Data Successfully!....");
		c.close();
	}
	
	public static void getallData() throws Exception{  // getall the data
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c  = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		Statement s = c.createStatement();
		ResultSet r1 = s.executeQuery("Select * from car_info");
		
		System.out.println(" all the data car_info : ");
		
		while(r1.next()) {
			System.out.println(r1.getInt(1) + " " + r1.getString(2) + " color " + " is "+ r1.getString(3) );
		}
	
		c.close();
	}

	
	public static void main(String[] args) throws Exception{
		Car c = new Car();
//		c.insertdata();
//		c.updateData();
		c.deleteData();
//		c.getallData();
	}

}
