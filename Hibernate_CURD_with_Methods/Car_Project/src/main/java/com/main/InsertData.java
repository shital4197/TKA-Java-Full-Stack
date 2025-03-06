package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Car;

public class InsertData {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Car c1 = new Car();
		c1.setName("Porsche 911 Turbo S");
        c1.setColor("Red");
        c1.setCompany("Porsche");
        c1.setPrice("3.5 corores");
        c1.setModel("325 speed");
        
        ss.persist(c1);
		System.out.println(" Data is inserted Successfully !");
		tr.commit();
		ss.close();
        
	}

}
