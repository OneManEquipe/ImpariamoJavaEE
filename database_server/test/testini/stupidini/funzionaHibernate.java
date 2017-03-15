package testini.stupidini;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Book;

public class funzionaHibernate {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		Book b = session.get(Book.class, "9780002155878");
		
		System.out.println(b.toString());
		System.out.println(b.getCategory().toString());
		transaction.commit();
		sessionFactory.close();
	}
}
