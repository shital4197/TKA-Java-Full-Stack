package com.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;
import com.entity.Students;

import jakarta.persistence.criteria.Root;

public class StudentDao {
	
	public static void InsertData() {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Students s = new Students();
		s.setFname("Karan");
		s.setLname("Nishad");
		s.setCity("Raipur");
		s.setState("Chhatisgarh");
		s.setPhonenumber("8889657489");
		s.setEmail("karan@gmail.com");
		
		ss.persist(s);
		System.out.println("Student data inserted successfully!");
		
		tr.commit();
		ss.close();
	}

	public void UpdateData() {
		
		Configuration cfg  = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Students.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int stdid = 1;
		Students s1 = ss.get(Students.class, stdid);
		s1.setCity("Pune");
		s1.setState("Maharashtra");
		s1.setFname("Ram");
		s1.setEmail("ram@gmail.com");
		s1.setLname("Nikam");
		s1.setPhonenumber("8896574896");
//		ss.update(s1);
		ss.merge(s1);
		System.out.println("Students data updated successfully! ");
		tr.commit();
		ss.close();
	}

	public void GetSingleData() {
		
		Configuration cfg  = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Students.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int stdid = 1;
		Students s2 = ss.get(Students.class, stdid);
//		ss.save(s2);
		ss.persist(s2);
		System.out.println(s2);
		
		tr.commit();
		ss.clear();
	}

	public void DisplayAllData() {
		Configuration cfg  = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Students.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		HibernateCriteriaBuilder hcb = ss.getCriteriaBuilder();
		JpaCriteriaQuery<Object> cq = hcb.createQuery();
		Root<Students> root = cq.from(Students.class);
		
		cq.select(root);
		
		Query<Object> query = ss.createQuery(cq);
		List<Object> list = query.getResultList();
		
		for(Object std : list) {
			System.out.println(std);
		}
		
	}

	public void DeleteAllData() {
		
		Configuration cfg  = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Students.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		int stdid = 1;
		Students s1 = ss.get(Students.class, stdid);

		ss.remove(s1);
		System.out.println("Students data deleted successfully! ");
		tr.commit();
		ss.close();
		
	}

}
