package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Hospital;

public class InsertData {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hospital.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Hospital h1 = new Hospital();
		h1.setName("Sanchiti");
		h1.setPhone_no("88896589748");
		h1.setDepartments("cardiology");
		h1.setCity("Pune");
		h1.setDoctors(558);
		h1.setPateint(1050);
		h1.setEmail("sanchitihopital@gamil.com");
		h1.setState("Maharashtra");
		ss.persist(h1);
		System.out.println("Hospital Data is inserted successfully!");
		tr.commit();
		ss.close();
	}

}
