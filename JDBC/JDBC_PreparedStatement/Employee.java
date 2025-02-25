package comprepstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee {
	
	public static void insertData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		PreparedStatement p = c.prepareStatement("insert into employees(id , name ,salary ,city) values (?,?,?,?)");
		p.setInt(1, 6);
		p.setString(2,"Kamini");
		p.setInt(3, 26000);
		p.setString(4, "Mumbai");
		p.executeUpdate();	
		System.out.println("Inserted data!.... ");
		c.close();
		
	}

	public void updateData() throws Exception{
		
   	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		PreparedStatement ps=c.prepareStatement("update employees set name=? where id=?");
		ps.setInt(2, 4);
		ps.setString(1, "Shivani");
		ps.executeUpdate();
		System.out.println("Updated Successfully!... ");
		c.close();
	}

	public void deleteData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		PreparedStatement p = c.prepareStatement("delete from employees where id = ?");
		p.setInt(1, 3);
		p.executeUpdate();
		System.out.println("Deleted the data successuly!...");
		c.close();
	}

	public void getAllRecord() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		PreparedStatement p = c.prepareStatement("select * from employees");
		ResultSet rs = p.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+ " " + rs.getInt(3) + " "+ rs.getString(4) );
		}
		c.close();
	}
	

}
