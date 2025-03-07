package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class UpdateData {

     public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int emp_id = 2;
		Employee e1 = ss.get(Employee.class, emp_id);
		
		e1.setCity("Raipur");
		e1.setFrist_name("Sangita");
		e1.setLast_name("Sahu");
		e1.setPhone_no("8896574896");
//		ss.update(c1);
		ss.merge(e1);
		
		System.out.println("Employee Data Updated Successfully....");
		tr.commit();
		ss.close();
	}

}
