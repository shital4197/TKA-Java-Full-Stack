package comprepstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Company {

	public void insertData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		PreparedStatement p = c.prepareStatement("insert into company(id,name , state)values(?,?,?)");
		p.setInt(1, 105);
		p.setString(2, "Cognizant");
		p.setString(3, "ai");
		p.executeUpdate();
		System.out.println("Inserted successfully!");
		c.close();		
	}

	public void updateData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		PreparedStatement p = c.prepareStatement("update company set name = ?,state = ? where id = ?");
		p.setInt(3, 103);
		p.setString(1, "Accenture");
		p.setString(2, "Chattisgarh");
		p.executeUpdate();
		System.out.println("Updated successfully!");
		c.close();	
		
	}

	public void deleteData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root" ,"root");
		PreparedStatement p = c.prepareStatement("delete from company where id = ?");
		p.setInt(1,105);
		p.executeUpdate();
		System.out.println("Deleted Successfully!");
		c.close();
		
	}

	public void getallData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root" ,"root");
		PreparedStatement p = c.prepareStatement("select*from company");
		ResultSet rs = p.executeQuery();
		System.out.println("Display all data : ");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ " "+ rs.getString(2)+" "+ rs.getString(3));
		}
		
	}

}
