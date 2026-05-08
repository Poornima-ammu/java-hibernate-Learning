package com.poornima.MyHibernateLearning;


import org.hibernate.Session;
import java.util.*;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.Transaction;


public class App 
{
    public static void main( String[] args )
    {
    	Alien a1=new Alien();
    //	a1.setAid(104);
   	a1.setAname("John");
    	a1.setColor("Black");
    	a1.setDOB(new Date());
    	 
    	Configuration con=new Configuration();
    	con.configure("hibernate.cfg.xml").addAnnotatedClass(Alien.class);
    	
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
   // 	session.persist(a1);
    	a1= (Alien)session.get(Alien.class, 1);
    	tx.commit();
    	System.out.println(a1);
    
    }
}

