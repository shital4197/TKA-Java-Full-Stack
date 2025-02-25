package comprepstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Animal {

	public void insertData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver"); // loading the driver class 
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root"); // get connection 
		PreparedStatement p1 = c.prepareStatement("insert into animal_info(id, name)values(?,?)");  // by using the placeholder ?
		p1.setInt(1, 7);
		p1.setString(2,"Lion");
		System.out.println("Inserted Successfully!...");
		p1.executeUpdate();
		c.close();
		
	}

	public void updateData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver"); // loading the driver class 
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root"); // get connection
		PreparedStatement p2 = c.prepareStatement("update animal_info set name = ? where id = ?");
		p2.setInt(2, 5);
		p2.setString(1, "Zebra");
		p2.executeUpdate();
		System.out.println("Updated Successfully!..");
		
	}

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root"); 
		PreparedStatement p3 = c.prepareStatement("delete from animal_info where id = ?");
		p3.setInt(1, 3);
		p3.executeUpdate();
		System.out.println("Deleted Data !");
		c.close();
	}

	public void getallData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root"); 
		PreparedStatement p4 = c.prepareStatement("Select * from animal_info");
		ResultSet rs = p4.executeQuery();
		System.out.println("Get all details : ");
		while(rs.next()) {
			System.out.println(rs.getInt(1) + " "+ rs.getString(2));
		}
		
	}

}
