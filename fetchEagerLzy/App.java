package com.poorinma.MyHibernateLearning.fetchEagerLzy;

import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class App {
	public static void main(String[]args) {
	/**laptop lapy =new laptop();
	lapy.setLapId(101);
	lapy.setLapName("HP");
	Alien a1=new Alien();

	a1.setAid(4);
	a1.setColor("White");
     // important
	a1.setLapi(Arrays.asList(lapy));
	lapy.setA1(a1);
	**/
	Configuration con=new Configuration().configure("hibernate.cfg.xml");
	SessionFactory factory=con.buildSessionFactory();
	Session s=factory.openSession();
	//a1=(Alien)s.get(Alien.class,1);
	Transaction tx=s.beginTransaction();
	//s.persist(a1);
	//s.persist(lapy);
	

	Alien a=s.get(Alien.class,2);
	System.out.println(a.getColor());
	Collection<laptop>laps=a.getLapi();
	for(laptop li:laps) {
		System.out.println(li);
	}
	tx.commit();
	s.close();
	factory.close();
	
	
	}
}
