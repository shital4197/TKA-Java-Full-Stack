package com.jdbcstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Company {
	
	public static void insertdata() throws Exception { // inserted data
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		Statement s = c.createStatement();
//		s.executeUpdate("insert into company values(101,'Capgemini','Maharashtra')");
		s.executeUpdate("insert into company values(102,'Infosys','Bangluru'),(103,'Michrosoft','Bangluru'),"
				+ "(102,'Hexaware','Tamil-Nadu'),(105,'Paypal','Kolkatta')");
		System.out.println("Successfully inserted the data!....");
		c.close();
	}
	
	public static void updateData() throws Exception {  // updated the Data
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("update company set id = 104 where name = 'hexaware'");
		System.out.println("Update Data Successfully");
		c.close();
	}
	
	public static void deleteData() throws Exception{ // deleted the data 
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c  = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		Statement s = c.createStatement();
		s.execute("delete from company where id = 105 ");
		System.out.println("Deleted Data Successfully!....");
		c.close();
	}
	
	public static void getallData() throws Exception{  // getall the data
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c  = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		Statement s = c.createStatement();
		ResultSet r1 = s.executeQuery("Select * from company");
		
		System.out.println(" Company Data : ");
		
		while(r1.next()) {
			System.out.println(r1.getInt(1) + " " + r1.getString(2) + " in " + r1.getString(3) );
		}
	
		c.close();
	}

	
	public static void main(String[] args) throws Exception  {
		Company c = new Company();
//		c.insertdata();
//		c.updateData();
//		c.deleteData();
		c.getallData();
	}

}
