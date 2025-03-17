package com.main;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entity.Courses;
import com.entity.Students;

public class MainClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students.class);
		cfg.addAnnotatedClass(Courses.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		Courses c = new Courses();
		c.setCid(2221);
		c.setCname("Java");
		ss.persist(c);

		Courses c1 = new Courses();
		c1.setCid(2222);
		c1.setCname("python");
		ss.persist(c1);

		Courses c2 = new Courses();
		c2.setCid(2223);
		c2.setCname("PHP");
		ss.persist(c2);

		Students s1 = new Students();
//	    s.setId(0); // auto increament
		s1.setCity("Nashik");
		s1.setName("Rahul");
		s1.setState("Maharashtra");
		ss.persist(s1);

		Students s2 = new Students();
		s2.setCity("Dharashiv");
		s2.setName("Shivam");
		s2.setState("Maharashtra");
		ss.persist(s2);

		Students s3 = new Students();
		s3.setCity("Raipur");
		s3.setName("Karan");
		s3.setState("Chhatisgrh");
		ss.persist(s3);

		Students s4 = new Students();
		s4.setCity("Durg");
		s4.setName("Raghav");
		s4.setState("Chhatisgrh");
		ss.persist(s4);

		ArrayList<Students> list = new ArrayList<Students>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);

		ArrayList<Courses> list1 = new ArrayList<Courses>();
		list1.add(c);
		list1.add(c1);
		list1.add(c2);

		c.setStd(list);
		s4.setCourse(list1);

		System.out.println("Data is inserted successfully!");
		tr.commit();
		ss.close();

	}

}
