package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Laptop;
import com.entity.Student;

public class MainClass {
	
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Laptop.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Laptop l = new Laptop();
		l.setLid(12000);
		l.setLname("HP");
	    ss.persist(l);
	    
	    Student s = new Student();
//	    s.setStdid(1);    auto-increament 
	    s.setStdname("Karan");
	    s.setLap(l);

	    ss.persist(s);
	    
	    System.out.println("Data inserted successfully!");
	    
	    tr.commit();
	    ss.close();
	}

}
