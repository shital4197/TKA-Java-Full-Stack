package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HospitalMain {

	public static void main(String[] args) {
		
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Hospital.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
	    Hospital h1 = new Hospital();
	    h1.setHospital_id(101);
	    h1.setName("Rubi");
		h1.setCity("Pune");
		h1.setState("Maharashtra");
		h1.setDoctors(150);
		h1.setPateint(350);
		h1.setDepartments("Nurology");
		h1.setEmail("rubi@gmail.com");
		h1.setPhone_no("78965874896");
		
		ss.persist(h1);
		
		System.out.println("Your data is inserted!..");
		
		tr.commit();
		ss.close();

	}

}
