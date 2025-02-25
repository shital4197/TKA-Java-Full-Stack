package comprepstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Person {
	
	public void insertData() throws Exception{ // inserted the data 
		Class.forName("com.mysql.cj.jdbc.Driver"); // loading the driver class 
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root"); // get connection 
		PreparedStatement p = c.prepareStatement("insert into person(id, name , city)values(?,?,?)");  // by using the placeholder ?
		p.setInt(1, 5);
		p.setString(2,"Kaushik");
		p.setString(3, "Amravati");
		System.out.println("Inserted the Data Successfully!...");
		p.executeUpdate();
	}

	public void updateData() throws Exception  {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root", "root");
		PreparedStatement p = c.prepareStatement("update person set name=? where id=?");
		p.setInt(2, 3);
		p.setString(1, "Samiksha");
		p.executeUpdate();
		System.out.println("Updated Successfully!....");
		c.close();
	}

	public void deleteData() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		PreparedStatement p = c.prepareStatement("delete from person where id = ?");
		p.setInt(1, 3);
		p.executeUpdate();
		System.out.println("Deleted successuly!...");
		c.close();
		
	}

	public void displayAllData() throws Exception { // display the all the data
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		PreparedStatement p = c.prepareStatement("select * from person");
		ResultSet r1 = p.executeQuery(); // creating the query
		System.out.println("Display all the data:");
		while(r1.next()) { // move forford from it's currunt possition
			System.out.println(r1.getInt(1)+ " " + r1.getString(2)+ " "+r1.getString(3));
		}
		c.close();
		
	}
	
	

}
