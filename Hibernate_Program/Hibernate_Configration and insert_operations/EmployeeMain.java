package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeMain {

	public static void main(String[] args) {
		
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Employee.class);
			
			SessionFactory sf = cfg.buildSessionFactory();
			Session ss = sf.openSession();
			Transaction tr = ss.beginTransaction();
			
		    Employee e1 = new Employee();
		    e1.setE_id(101);
		    e1.setFrist_name("Kiran");
			e1.setLast_name("Sutar");
			e1.setCity("Pune");
			e1.setExprience(2);
			e1.setRole("Tester");
			e1.setPhone_no("888965748958");
			e1.setSalary("5 LPA");
			
			ss.persist(e1);
			
			System.out.println("Your data is inserted!..");
			
			tr.commit();
			ss.close();

		}

	}

