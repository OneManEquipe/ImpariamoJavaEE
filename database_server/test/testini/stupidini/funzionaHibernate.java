package testini.stupidini;

import org.hibernate.Session;

import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import com.model.Book;
import com.spring.SpringContextFactory;

public class FunzionaHibernate {

	@Test
	public void testHibernate() {

		// SessionFactory sessionFactory = new
		// Configuration().configure().buildSessionFactory();
		// Session session = sessionFactory.getCurrentSession();
		
		//try che auto chiude il context
		try (ConfigurableApplicationContext context = SpringContextFactory.getContext("spring/hibernateBeans.xml")) {
			Session session = (Session) context.getBean("session");

			Transaction transaction = session.beginTransaction();

			Book b = (Book) session.get(Book.class, "9780003831795");
			System.out.println(b.toString());
			System.out.println(b.getCategory().toString());
			transaction.commit();
		}

	}
}
