package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Vehicle;

public class InsertData {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Vehicle.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "insert into vehicle_info(color , name) values (:color , :color)";
		
		MutationQuery query = ss.createNativeMutationQuery(hqlQuery);
		
		query.setParameter("color","Black");
		query.setParameter("name", "Thar");
	    query.executeUpdate();
	    
	    System.out.print("Data is inserted !");
	    
	    tr.commit();
	    ss.close();
		
		}
	}


