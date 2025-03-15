package com.main;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entity.Country;
import com.entity.Employees;

public class MainClass {
		
		public static void main(String[] args) {
			
			Configuration cfg = new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(Country.class);
			cfg.addAnnotatedClass(Employees.class);
			
			SessionFactory sf = cfg.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction tr = ss.beginTransaction();
			
			Country c = new Country();
			c.setCid(91);
			c.setName("India");
		
			Employees e = new Employees();
			e.setEid(112);
			e.setEname("Pinki Sharma");
			e.setCuntry(c);
			
			Employees e1 = new Employees();
			e1.setEid(113);
			e1.setEname("Pari Mane");
			e1.setCuntry(c);
			
			ArrayList<Employees> list = new ArrayList<Employees>();
			list.add(e);
			list.add(e1);
			
			c.setEmp(list);
			
			ss.persist(e);
			ss.persist(e1);
			ss.persist(c);
			
			System.out.println("Data inserted successfully!");
			tr.commit();
			ss.close();
	}

}
