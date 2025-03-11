package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Vehicle;

public class GetSingleData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Vehicle.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Vehicle where vid=:vid";
		
		int vid = 2;
		Query<Vehicle> query = ss.createQuery(hqlQuery);
		query.setParameter("vid", vid);
		
		Vehicle v1 = query.getSingleResult();
//		Vehicle v2 = query.uniqueResult();
		
		System.out.println(v1);
		
		tr.commit();
		ss.close();
	}

}
