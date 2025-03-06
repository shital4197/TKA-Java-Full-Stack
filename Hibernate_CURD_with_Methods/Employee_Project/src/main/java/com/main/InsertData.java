package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class InsertData {

	public static void main(String[] args) {
		
	   Configuration cfg = new Configuration();
	   cfg.configure();
	   cfg.addAnnotatedClass(Employee.class);
	   
	   SessionFactory sf = cfg.buildSessionFactory();
	   Session s1 = sf.openSession();
	   Transaction tr = s1.beginTransaction();
	   
	   Employee e1 = new Employee();
	   e1.setFrist_name("Lilavti");
       e1.setLast_name("Wagh");
	   e1.setCity("Manchar");
	   e1.setExprience(1);
	   e1.setPhone_no("8856458748");
	   e1.setSalary("3.5 LPA");
	   e1.setRole("HR");
	   s1.persist(e1);
	   System.out.println("Employee Data is inserted Successfully!");
	   tr.commit();
	   s1.close();
	   
	}

}
