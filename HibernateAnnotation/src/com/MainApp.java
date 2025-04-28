package com;


public class MainApp {
	public static void main(String[] args) {
		cricketer c=new cricketer();
		c.setcric_name("Sachin");
		c.setcountry("India");
		c.setmatches(200);
		c.setruns(19000);
		c.setwickets(100);
		
		HibernateManager hbm=new HibernateManager();
		hbm.addCricketer(c);
	}

}

