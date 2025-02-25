package com.employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/empinfo1")
public class Employee extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String fname              = request.getParameter("fname");
		String lname              = request.getParameter("lname");
		String age                = request.getParameter("age");
		String date_of_brith      = request.getParameter("DOB");
		String salary             = request.getParameter("salary");
		String role               = request.getParameter("role");
		String j_date             = request.getParameter("date");
		String exprience          = request.getParameter("exprience");
		String city               = request.getParameter("city");
		String country            = request.getParameter("country");
		String phone              = request.getParameter("phone");
		String m_status           = request.getParameter("marital_status");
		String gender             = request.getParameter("gender");
		String email              = request.getParameter("email");
		String pss                = request.getParameter("password");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
			PreparedStatement ps = c.prepareStatement("insert into employee(fname,lname,Age,Date_of_Brith,Salary,role,Joining_date,Exprience,city,country,phone,marital_status,gender,email,password)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			
			ps.setNString(1, fname);
			ps.setNString(2, lname);
			ps.setNString(3, age);
			ps.setNString(4, date_of_brith);
			ps.setNString(5, salary);
			ps.setNString(6, role);
			ps.setNString(7, j_date);
			ps.setNString(8, exprience);
			ps.setNString(9, city);
			ps.setNString(10, country);
			ps.setNString(11, phone);
			ps.setNString(12, m_status);
			ps.setNString(13, gender);
			ps.setNString(14, email);
			ps.setNString(15, pss);
			ps.executeUpdate();
			
		    PrintWriter out = response.getWriter();	
		    System.out.println("Employee date inserted!...");
		    out.println("<h1>"+"Employee data inserted!"+"</h1>");
		    
		    response.setContentType("text/html");
		    out.print("<h1>"+"login here"+"</h1>");
		    RequestDispatcher rd = request.getRequestDispatcher("/login.html");
		    rd.include(request, response);
		    c.close();
		    
		} catch (Exception e) {
				
		}

	}

}