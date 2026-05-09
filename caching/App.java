package com.poorinma.MyHibernateLearning.caching;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[]args) {
		Alien a=new Alien();
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory factory=con.buildSessionFactory();
		Session session1=factory.openSession();
		Transaction tx=session1.beginTransaction();
		a=(Alien) session1.get(Alien.class, 101);
		System.out.println(a);
		tx.commit();
		session1.close();

		Session session2=factory.openSession();
		Transaction tx1=session2.beginTransaction();


		a=(Alien) session2.get(Alien.class, 101);
		System.out.println(a);
		tx1.commit();
		session2.close();

		
	}

}
