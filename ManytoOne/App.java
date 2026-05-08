package com.poorinma.MyHibernateLearning.mapping.ManytoOne;
import org.hibernate.cfg.Configuration;
import org.hibernate.*;
import java.util.Arrays;

public class App {
	public static void main(String[]args) {
		Department dept=new Department();
		dept.setDeptid(101);
		dept.setDname("Developer");
		
		Employee emp=new Employee();
		emp.setEmpid(201);
		emp.setEname("Poornima");
		
		emp.setDept(dept);
		dept.setEmp(Arrays.asList(emp));
		
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		System.out.println(dept);
		session.persist(dept);
		session.persist(emp);
		
		tx.commit();
		
	}
}
