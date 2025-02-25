package com.jdk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CustmoersMain {
	
	public static void main(String[] args) throws Exception{
		
		Custmoers m1 = new Custmoers();
//		m1.insertData();
//		m1.updateData();
//		m1.deleteData();
		m1.getAllData();
		

	}
	
}
