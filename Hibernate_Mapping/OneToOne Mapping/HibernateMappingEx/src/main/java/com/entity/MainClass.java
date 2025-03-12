package com.entity;

import java.io.ObjectInputFilter.Config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Customer.class);
		cfg.addAnnotatedClass(Bike.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Bike b = new Bike();
		b.setBikeid("MH25");
		b.setBikename("Yamaha");
		ss.persist(b);
		
		Customer c = new Customer();
		c.setName("Karan");
		c.setCity("Pune");
		c.setBikeno(b);
		ss.persist(c);
		
		System.out.println("Data is inserted!!");
		
		tr.commit();
		ss.close();
	}
}
