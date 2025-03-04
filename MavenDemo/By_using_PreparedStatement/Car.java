package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Car {

	public static void insertData() throws Exception { // inserted the data

		Class.forName("com.mysql.cj.jdbc.Driver"); // registers and loading driver class
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root"); 
		PreparedStatement ps = c.prepareStatement("insert into car(id ,name,color,model,company,price)values (?,?,?,?,?,?)"); 
																												
		ps.setInt(1, 102);
		ps.setString(2, "City");
		ps.setString(3, "White");
		ps.setString(4, "EV Drive");
		ps.setString(5, "Honda");
		ps.setString(6, "20.5 Lakh");
		ps.executeUpdate();
		System.out.println("Data inserted Successfully!... :)");
		c.close();
	}

	public void updateData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root"); 																						
		PreparedStatement ps = c.prepareStatement("update car set color = ? where id = ?"); 
		ps.setInt(2, 102);
		ps.setString(1, "Red");
		ps.executeUpdate();
		System.out.println("Data updated Successfully!... :)");
		c.close();

	}

	public void deleteData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		PreparedStatement ps = c.prepareStatement("delete from car where id = ?"); // delete the data values
		ps.setInt(1, 102);
		ps.executeUpdate();
		System.out.println("Data deleted Successfully!... :)");
		c.close();

	}

	public void dispalyAllData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		PreparedStatement ps = c.prepareStatement("select * from car "); // display all data values

		System.out.println(" Car all data display!");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " || " + rs.getString(2) + " || " + rs.getString(3) + " " + " || " + " "
					+ rs.getString(4) + " " + " || " + " " + rs.getString(5) + " || " + rs.getString(6));
		}

		c.close();

	}

}
