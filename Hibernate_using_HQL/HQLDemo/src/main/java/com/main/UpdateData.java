package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Vehicle;

public class UpdateData {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Vehicle.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "update Vehicle set name =:name , color=:color where vid=:vid";
		
		Query<Vehicle> query = ss.createQuery(hqlQuery);
		
		query.setParameter("name","Thar");
		query.setParameter("vid", 4);
		query.setParameter("color", "Black");
		query.executeUpdate();
		
		System.out.println("Vehicle data is updated successfully!");
		tr.commit();
		ss.close();
	}

}
