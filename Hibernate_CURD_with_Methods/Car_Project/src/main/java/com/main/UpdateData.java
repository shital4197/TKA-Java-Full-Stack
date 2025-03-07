package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Car;

public class UpdateData {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Car.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int car_id = 1;
		Car c1 = ss.get(Car.class, car_id);
		
		c1.setColor("White");
		
//		ss.update(c1);
		ss.merge(c1);
		
		System.out.println("Car Data Updated Successfully....");
		tr.commit();
		ss.close();
	}
}
