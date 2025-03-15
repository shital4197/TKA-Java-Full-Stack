package com.main;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entity.Department;
import com.entity.Employee;

public class MainClass {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Department.class);
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Department d = new Department();
		d.setDid(102);
		d.setDname("Devloper");
	    
	    Employee e = new Employee();
	    e.setEid(11);
	    e.setEname("Om");
	    e.setDept(d);
	    
	    Employee e1 = new Employee();
	    e1.setEid(12);
	    e1.setEname("Raj");
	    e1.setDept(d);
	    
	    Employee e2 = new Employee();
	    e2.setEid(13);
	    e2.setEname("Shivam");
	    e2.setDept(d);
	    
	    ArrayList<Employee> list = new ArrayList<Employee>();
	    list.add(e);
	    list.add(e1);
	    list.add(e2);
	    
	    d.setEmp(list);
	    
	    ss.persist(d);
	    ss.persist(e);
	    ss.persist(e1);
	    ss.persist(e2);
	    
		System.out.println("Data inserted successfully!");
		tr.commit();
		ss.close();

	}

}
