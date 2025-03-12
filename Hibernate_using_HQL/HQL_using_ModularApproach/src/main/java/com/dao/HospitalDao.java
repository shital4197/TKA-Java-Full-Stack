package com.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;
import com.entity.Hospital;
import jakarta.persistence.criteria.Root;

public class HospitalDao {
	
	public static void InsertData() { // insert the data
		
	    Configuration cfg = new Configuration();
	    cfg.configure("hibernate.cfg.xml");
	    cfg.addAnnotatedClass(Hospital.class);

	    SessionFactory sf = cfg.buildSessionFactory();
	    Session ss = sf.openSession();
	    Transaction tr = ss.beginTransaction();

	    String hqlQuery = "insert into Hospital_info (name, city, state, email, contact) " +
	                      "values (:name, :city, :state, :email, :contact)";

	    MutationQuery query = ss.createNativeMutationQuery(hqlQuery);

	    query.setParameter("name", "Rubi");
	    query.setParameter("city","Pune");
	    query.setParameter("state","Maharashtra");
	    query.setParameter("email", "sanchiti@gmail.com");
	    query.setParameter("contact","88957489654");

	    query.executeUpdate(); 

	    System.out.println("Hospital data inserted successfully!");

	    tr.commit();
	    ss.close();
	}


	public void UpdateData() {   // update the data
		
		Configuration cfg  = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hospital.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String HqlQuery = "update Hospital set name=:name , city=:city , email=:email where hospitalid=:hospitalid";
	
		Query<Hospital> query = ss.createQuery(HqlQuery);
		
		query.setParameter("name","Sanchiti");
		query.setParameter("city","Nagpur");
		query.setParameter("email","sanchiti@gmail.com");
		query.setParameter("hospitalid", 1);
		query.executeUpdate();
		
		System.out.println("Hospital data updated successfully! ");
		tr.commit();
		ss.close();
	}

	public void GetSingleData() { // get the single data
		
		Configuration cfg  = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hospital.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		String hqlQuery = "from Hospital where hospitalid= :hospitalid";
	    int hospitalid = 1;

		Query<Hospital> query = ss.createQuery(hqlQuery);
		query.setParameter("hospitalid", hospitalid); 
		
		Hospital s2 = query.getSingleResult();
//		Hospital s3 = query.uniqueResult();

		System.out.println(s2);
		
		tr.commit();
		ss.clear();
	}

	public void DisplayAllData() {   // get all the data
	    Configuration cfg = new Configuration();
	    cfg.configure();
	    cfg.addAnnotatedClass(Hospital.class);

	    SessionFactory sf = cfg.buildSessionFactory();
	    Session ss = sf.openSession();
	    Transaction tr = ss.beginTransaction();

	    String hqlQuery = "from Hospital";

	    Query<Hospital> query = ss.createQuery(hqlQuery, Hospital.class);

	    List<Hospital> list = query.list();
	    
	    System.out.println("Display all data of an Hospital! ");
	    
	    for (Hospital hospital : list) {
	        System.out.println(hospital);
	    }

	    tr.commit();
	    ss.close();
	}

	public void DeleteData() {     // deleted data
		
		Configuration cfg  = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Hospital.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

	    String hqlQuery = "delete from Hospital where hospitalid = :hospitalid";
		
		MutationQuery query = ss.createMutationQuery(hqlQuery);
		int hospitalid = 2;
		query.setParameter("hospitalid", hospitalid);
		query.executeUpdate();
		
		System.out.println("Hospital data deleted successfully! ");
		
		tr.commit();
		ss.close();
	}

}
