package com.dao;

import java.io.Serializable;
import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.SpringContextFactory;

public abstract class AbstractHibernateDao<Tbean,Tid extends Serializable, Tsearch> implements DaoInterface<Tbean, Tid, Tsearch>{

	private Class<Tbean> someClass;
	//ObjectinoConfStringinDustrinO
	//context qui, bisogna valutare se inserire in classe padre (di tutti i DAO). dai
	ConfigurableApplicationContext context = SpringContextFactory.getContext("spring/hibernateBeans.xml"); 
		
	public AbstractHibernateDao(Class<Tbean> cls){
		someClass = cls;
	}
	
	@Override
	public boolean save(Tbean bean) {
		
		Session session = (Session) context.getBean("session");

		Transaction transaction = session.beginTransaction();
		session.save(bean);
		transaction.commit();
		
		return true;
	}

	@Override
	public boolean delete(Tid id) {
		
		Session session = (Session) context.getBean("session");

		Transaction transaction = session.beginTransaction();
		session.delete(session.get(someClass, id)); //check cascade nell'associationina.stupidina
		transaction.commit();
		
		return false;
	}

	@Override
	public boolean update(Tbean bean) {
		
		
		Session session = (Session) context.getBean("session");
		Transaction transaction = session.beginTransaction();
		session.update(bean);

		transaction.commit();
		return false;
	}
}
