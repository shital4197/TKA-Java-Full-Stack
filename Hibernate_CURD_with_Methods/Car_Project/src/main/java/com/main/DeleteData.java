package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Car;

public class DeleteData {

public static void main(String[] args) {  
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction(); 
		
		int car_id = 3;
		Car c1 = ss.get(Car.class, car_id);
		
		ss.remove(c1);
		System.out.println("Car data is deleted!");
		tr.commit();
		ss.clear();
	}

}


