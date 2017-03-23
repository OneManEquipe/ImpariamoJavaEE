package testini.stupidini;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;

import com.model.Book;
import com.model.Category;
import com.spring.SpringContextFactory;

public class CRUDTest {

	private ConfigurableApplicationContext context = SpringContextFactory.getContext("spring/hibernateBeans.xml");
	
	@Test
	public void testCRUD(){
		//creuccia, assertina, cancellina
		
		//CREATE
		Session createSession = (Session) context.getBean("session");
		Transaction createTransaction = createSession.beginTransaction(); //transaction /session del create
		
		Category cat = createSession.get(Category.class, 1);
		Book testBook = new Book("demo0001", "titolo Test", "edizione Test", "autore Test", 1995, "pubblicatore Test", 33, "treggiari", cat );
		createSession.save(testBook);
		createTransaction.commit();
		
		//READ
		Session readSession = (Session) context.getBean("session");
		Transaction readTransaction = readSession.beginTransaction(); //transaction /session del create
		
		testBook = (Book)readSession.get(testBook.getClass(), "demo0001");
		assertEquals("demo0001", testBook.getId()); //create/read assert
		
		testBook.setAuthor("authorChanged");
		readSession.update(testBook);
		readTransaction.commit();
		
		//rileggo demo0001 e verifico che author sia cambiato....
		readSession = (Session) context.getBean("session");
		readTransaction = readSession.beginTransaction(); //transaction /session del create
		testBook = (Book)readSession.get(Book.class, "demo0001");
		assertEquals("authorChanged", testBook.getAuthor());
		readSession.close();
		
		
		Session deleteSession = (Session) context.getBean("session");
		Transaction deleteTransaction = deleteSession.beginTransaction(); //transaction /session del create
		deleteSession.delete((Book)deleteSession.get(Book.class, "demo0001"));
		deleteTransaction.commit(); 
		
		readSession = (Session) context.getBean("session");
		readTransaction = readSession.beginTransaction(); //transaction /session del create
		testBook = (Book)readSession.get(Book.class, "demo0001");
		assertNull(testBook);
		readSession.close();
		
		
	}
	
	
}
