package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Hospital;

public class deleteData {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hospital.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int hospital_id = 3;
		Hospital h1 = ss.get(Hospital.class, hospital_id);
		ss.remove(h1);
		System.out.println("Hospital Deleted Data Successfully!");
        tr.commit();
        ss.close();
		
	}

}
