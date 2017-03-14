package testiniStupidini;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.model.hibernateWrappers.WrapperBook;

public class funzionaHibernate {

	@Test
	public void provaSave() {
		WrapperBook b = new WrapperBook();
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		b.setId("0123456789");
		b.setAuthor("Alessandro");
		b.setTitle("La mia storia");
		b.setPublisher("Ferrari");
		b.setCategory_id(10);
		
		session.save(b);
		transaction.commit();
		sessionFactory.close();
	}
}
