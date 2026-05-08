package com.poorinma.MyHibernateLearning.mapping;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class App {
	public static void main(String []args) {
		Student s=new Student();
		s.setSname("Anjalli");
		s.setRollno(54);
		s.setAge(22);

		Course c=new Course();
		c.setCname("	Python");
		c.setCredits(3);
		c.setId(2);
        s.setCourse(Arrays.asList(c));
        c.setStudent(Arrays.asList(s));

		
		Configuration cf=new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		session.persist(s);
		session.persist(c);
		tx.commit();	
	}
}
