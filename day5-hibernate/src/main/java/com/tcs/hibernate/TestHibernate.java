package com.tcs.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestHibernate {

	public static void main(String[] args) {
	
		Configuration configure=new Configuration();//
		configure=configure.configure();
		
		SessionFactory factory=configure.buildSessionFactory();
		System.out.println(factory);
		
		Session session=factory.openSession();
		System.out.println(session);//?
		
		
		//fetching mutiple rows from db
		
		Query<Employee> query=session.createQuery("select e from Employee e");//striking means outdated
		 List <Employee> list=query.list();
		 Iterator <Employee>iter =list.iterator();
		 
		 while(iter.hasNext()) {
			 System.out.println(iter.next());
		 }
		 
		 
		 
		 
		
		//C R U D -create,retrival,update,delete
		
		Transaction transaction =session.beginTransaction();//before dml we should create transaction   
		
		//delete a row in db
//		Employee emp=session.get(Employee.class,2);
//		session.delete(emp);
		
		
		
		
		
		
		
		
		//updtae arow in db
		/*Employee emp=session.get(Employee.class,1);
		emp.setSal(123456);
		session.update(emp);
		System.out.println(emp);*/
		
		
		
		
		//fetch a row from dB
		 /*Employee emp=session.get(Employee.class,1);
		 System.out.println(emp);*/
		
		
		
		
		
		
		
		/*Employee emp=new Employee();
		emp.setEname("John");
		emp.setSal(25000);
		
		session.save(emp);*/
		
		transaction.commit();
		session.close();
		
		
		
		

	}

}
