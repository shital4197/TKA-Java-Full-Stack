package com.jdk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Custmoers {
	
    // PreparedStatement interface by using maven
	public void insertData() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver"); // registers and loading driver class
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204db","root","root"); // get connections
		PreparedStatement p = c.prepareStatement("insert into customers values (?,?,?,?,?,?)"); //statements
		p.setInt(1,104); //id
		p.setString(2,"Samiksha"); //name
		p.setString(3,"Yadaw"); // sirname
		p.setString(4,"smikshagmail.com"); // mail
		p.setString(5,"Raipur"); // city
		p.setString(6,"Chhatisgarh"); // state
		p.executeUpdate(); // sql statement
		System.out.println("Inserted data in databases!..");  // print
		c.close(); // close connections
	}
	
	public void updateData() throws Exception { // update data
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204db","root","root");
		PreparedStatement p = c.prepareStatement("update customers set name = ? where id = ?");
		p.setInt(2, 102);
		p.setString(1,"Shubhangi");
		p.executeUpdate();
		System.out.println("Updated Successfully!...");
		c.close();
		}

	public void deleteData() throws Exception { //delete Data
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204db","root","root");
		PreparedStatement p = c.prepareStatement("delete from customers where id = 102");
		p.executeUpdate();
		System.out.println("Deleted Successfully!...");
		c.close();		
	}

	public void getAllData() throws Exception { // get all data
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204db","root","root");
		PreparedStatement p = c.prepareStatement("select * from customers");
		ResultSet rs = p.executeQuery();
		System.out.println("Display All Data!.....");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+ 
					" "+rs.getString(3)+" "+"mail id is"+" " + rs.getString(4)+ " " +"live in"+ " "+rs.getString(5)+" "+rs.getString(6));
		}
	}
}