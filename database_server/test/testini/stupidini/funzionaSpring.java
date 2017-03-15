package testini.stupidini;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.model.Book;

public class funzionaSpring {

	@Test
	public void scopriamolo() {
		try (ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring/test/provaBeans.xml")) {

			Book b = (Book) ctx.getBean("caccapupu");

			System.out.println(b.getTitle());
			
			assertTrue(true);
		}
	}
}
