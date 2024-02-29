package com.tcs.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestHibernateInvestor {

	public static void main(String[] args) {
		

		Configuration config=new Configuration();
		config=config.configure();
		
		SessionFactory fac=config.buildSessionFactory();
		
		Session session =fac.openSession();
		
		Transaction trans =session.beginTransaction();
		
		
		Investor inv=new Investor();
		
		inv.setName("ABC");
		inv.setAddress("chennai");
		inv.setAmount(2345);
		session.save(inv);
		
		
		inv.setName("DEF");
		inv.setAddress("mumbai");
		inv.setAmount(122345);
		session.save(inv);
		
		
		inv.setName("GHI");
		inv.setAddress("pune");
		inv.setAmount(234521);
		session.save(inv);
		
//		Investor inv1=session.get(Investor.class, 1);
//		session.delete(inv1);
//		
		
		trans.commit();
		
		
		
		session.close();//?
		
		

	}

}
