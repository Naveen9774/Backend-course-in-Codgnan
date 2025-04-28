package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateManager {
	
	 private Session session;

	public HibernateManager() {
	        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
	        ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
	        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());
	        session = sessionFactory.openSession();
	        System.out.println("Connected to Hibernateannoatations....");
	    }

	public void addCricketer(cricketer c) {
		Transaction beginTransaction= session.beginTransaction();
		session.save(c);
		System.out.println("Data is stored");
		beginTransaction.commit();
	}

	
}
