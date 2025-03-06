package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class DeleteData {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr  = ss.beginTransaction();
		
		int emp_id = 6;
		Employee e1 = ss.get(Employee.class, emp_id);
		ss.remove(e1);
		System.out.println("Employee data is deleted successfully!");
		tr.commit();
		ss.close();
	}

}
