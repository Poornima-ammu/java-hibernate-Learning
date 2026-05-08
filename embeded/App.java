package com.poornima.MyHibernateLearning.embeded;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class App {
	public static void main(String[]args) {
	Aname an=new Aname();
	an.setFname("ChandraShekar");
	an.setMname("Poornima");
	an.setLname("C");
	Alien a1=new Alien();

	a1.setAid(1);
	a1.setColor("Green");
    a1.setAname(an);   // important

	

	Configuration con=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory factory=con.buildSessionFactory();
	Session s=factory.openSession();
	//a1=(Alien)s.get(Alien.class,1);
	Transaction tx=s.beginTransaction();
	s.persist(a1);
	tx.commit();
	s.close();
	factory.close();
	
	
	}
}
