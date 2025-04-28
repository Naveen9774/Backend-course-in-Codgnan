package com.emp;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
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
        System.out.println("Connected to Pf....");
    }

    void saveEmployee(Employee e) {
        Transaction transaction = session.beginTransaction();
        session.save(e);
        System.out.println("Data is stored");
        transaction.commit();
    }
    
    void fetchAllData() {
    	Transaction transaction= session.beginTransaction();
    	Query query =session.createQuery("From Employee");
    	List list=query.list();
    	Iterator itr=list.iterator();
    	while(itr.hasNext()==true) {
    		Employee e1=(Employee)itr.next();
    		System.out.println(e1.getEmpId()+"----"+e1.getFirstName()+"----"+e1.getLastName()+"----"+e1.getEmail()+"----"+e1.getPhoneNumber()+"----"+e1.getHireDate()+"----"+e1.getJobTitle()+"----"+e1.getSalary());
    	}
    	transaction.commit();
    	
    }
    
    void fetchSpecific(int id) {
    	Transaction transaction= session.beginTransaction();
    	Employee e1=(Employee) session.get(Employee.class, id);
    	System.out.println(e1.getEmpId()+"----"+e1.getFirstName()+"----"+e1.getLastName()+"----"+e1.getEmail()+"----"+e1.getPhoneNumber()+"----"+e1.getHireDate()+"----"+e1.getJobTitle()+"----"+e1.getSalary());
    	transaction.commit();
    }
    
    void updateSpecific(int id ,String new_name) {
    	Transaction transaction= session.beginTransaction();
    	Employee e1=(Employee) session.get(Employee.class, id);
    	e1.setFirstName(new_name);
    	session.update(e1);
    	System.out.println("Data updated");
    	transaction.commit();
    	
    }
    void deleteSpecific(int id) {
    	Transaction transaction= session.beginTransaction();
    	Employee e1=(Employee) session.get(Employee.class, id);
    	session.delete(e1);
    	System.out.println("data deleted");
    	transaction.commit();
    }
    
}