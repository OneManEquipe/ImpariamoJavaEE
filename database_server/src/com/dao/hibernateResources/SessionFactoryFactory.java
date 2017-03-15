package com.dao.hibernateResources;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryFactory {

	public static SessionFactory getSession(){
		return new Configuration().configure().buildSessionFactory();
	}
	
	public static SessionFactory getSession(String path){
		return new Configuration().configure(path).buildSessionFactory();
	}
	
}
