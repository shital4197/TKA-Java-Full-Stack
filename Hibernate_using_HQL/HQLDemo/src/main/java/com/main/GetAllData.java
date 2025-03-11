package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Vehicle;

public class GetAllData {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Vehicle.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String HqlQuery = "from Vehicle";
		
		Query<Vehicle> query = ss.createQuery(HqlQuery,Vehicle.class);
		List list = query.list();
		
		for(Object v : list) {
			System.out.println(v);
		}
		
		tr.commit();
		ss.close();
		
	}

}
