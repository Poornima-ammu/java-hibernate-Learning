package com.poorinma.MyHibernateLearning.mapping.oneToone;
import java.util.Arrays;


import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[]args) {
		Person person=new Person();
		person.setPid(101);
		person.setName("Bharathi");
		person.setEmail("bharathi@gmail.com");
		
		
		PanCard pancard=new PanCard();
		pancard.setNumber("CFTJ98765");
		pancard.setCountry("India");
		pancard.setPerson(person);
		person.setPancard(pancard);
		
	Configuration cf=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory sf=cf.buildSessionFactory();
	Session s=sf.openSession();
	Transaction tx=s.beginTransaction();
	s.persist(person);
	s.persist(pancard);
	tx.commit();
	s.close();
	sf.close();
		
	}
	

}
