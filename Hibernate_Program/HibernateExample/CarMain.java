package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CarMain {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Car.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Car c1 = new Car();
		c1.setCar_id(101);
		c1.setName("BMW i4");
		c1.setColor("Black");
		c1.setModel("i4");
		c1.setCompany("BMW");
		c1.setPrice("75.5 Lakh");
		
		ss.persist(c1);
		
		System.out.println("Your data is inserted !..");
		
		tr.commit();
		ss.close();
	}

}
