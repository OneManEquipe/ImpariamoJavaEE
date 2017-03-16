package testini.stupidini;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;

import com.model.Loan;
import com.spring.SpringContextFactory;

public class FunzionaLoan {

	@Test
	public void testLoan() {
		try (ConfigurableApplicationContext context = SpringContextFactory.getContext("spring/hibernateBeans.xml")) {
			Session session = (Session) context.getBean("session");

			Transaction transaction = session.beginTransaction();

			Loan l = (Loan)session.get(Loan.class, "1");
			System.out.println(l.toString());
			System.out.println(l.getBook().toString());
			//System.out.println(l.getUser().toString());
			
			transaction.commit();
		}
	}
}
