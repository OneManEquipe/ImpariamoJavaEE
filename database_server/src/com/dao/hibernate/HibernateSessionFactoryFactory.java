package com.dao.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryFactory {

	public static SessionFactory getSessionFactory(String conf) {
		return new Configuration().configure(conf).buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory(){
		return new Configuration().configure().buildSessionFactory();
		
	}
}
