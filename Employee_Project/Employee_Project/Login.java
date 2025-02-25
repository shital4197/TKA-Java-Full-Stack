package com.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet{
	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException  {
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
				PreparedStatement ps = c.prepareStatement("select * from employee where email=? and password=?");
				ps.setString(1, email);
				ps.setString(2, password);
				ResultSet rs = ps.executeQuery();
				PrintWriter out = resp.getWriter();
				
				if(rs.next()) {
				    out.print("<h1 style='color:green;'>&#9989; Login Successfully! </h1>");
				} else {
				    out.print("<h1 style='color:red;'>&#10060; Invalid email or password! &#128542;</h1>");
				}
				c.close();
			}
			catch(Exception e) {
			}
		}
	}
