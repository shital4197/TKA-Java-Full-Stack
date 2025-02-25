package comprepstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Car {

	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		PreparedStatement p1 = c.prepareStatement("insert into car_info(id,name,color) values(?,?,?)");
		p1.setInt(1, 106);
		p1.setString(2, "Maruti Suzuki");
		p1.setString(3,"Red");
		p1.executeUpdate();
		System.out.println("Updated Successfully!....");
		c.close();
		
	}

	public void updateData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db", "root","root");
		PreparedStatement p2 = c.prepareStatement("Update car_info set id = ? where color = ?");
		p2.setInt(1,105);
		p2.setString(2,"white");
		p2.executeUpdate();
		System.out.println("Updated Successfully! ...");
		c.close();		
	}

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection s = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		PreparedStatement p3 = s.prepareStatement("delete from car_info where id = ?");
		p3.setInt(1, 104);
		p3.executeUpdate();
		System.out.println("Deleted Successfully");
		s.close();
		
	}
	
	public void getallData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection s = DriverManager.getConnection("jdbc:mysql://localhost:3306/204db","root","root");
		PreparedStatement p3 = s.prepareStatement("select * from car_info");
		ResultSet rs = p3.executeQuery();
		System.out.println("Display all the data :");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+ rs.getString(2)+ " "+ rs.getString(3));
		}
	}

	

}
