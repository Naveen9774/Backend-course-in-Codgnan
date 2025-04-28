package com.p1;

import java.lang.module.Configuration;
import java.util.Iterator;

import javax.jms.Session;
import javax.transaction.Transaction;

import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateManager {
    private Session session;

    public HibernateManager() {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = builder.buildServiceRegistry();
        session = sessionFactory.openSession();
        System.out.println("Connected to Pf....");
    }

    void saveEmployee(Employee e) {
        Transaction transaction = session.beginTransaction();
        session.save(e);
        System.out.println("data is stored");
        transaction.commit();
    }
}
