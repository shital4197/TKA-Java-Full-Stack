package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Vehicle;

public class DeleteData {
	
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Vehicle.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "delete from Vehicle where vid=: vid";
		
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		int vid = 5;
		query.setParameter("vid", vid);
		query.executeUpdate();
		
		System.out.println("Vehicle Data is deleted !");
		
		tr.commit();
		ss.close();
		
	}
	
	
	
    

}
