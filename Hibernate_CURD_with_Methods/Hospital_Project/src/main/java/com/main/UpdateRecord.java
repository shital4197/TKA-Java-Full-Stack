package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Hospital;


public class UpdateRecord {
	
public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hospital.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int hospital_id = 2;
		Hospital hosp = ss.get(Hospital.class, hospital_id);
		
		hosp.setCity("Bhilai");
		hosp.setState("Chhatisgarh");
		
//		ss.update(c1);
		ss.merge(hosp);
		
		System.out.println("Hospital Data Updated Successfully....");
		tr.commit();
		ss.close();
	}

}
