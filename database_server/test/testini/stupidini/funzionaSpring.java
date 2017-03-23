package testini.stupidini;

import static org.junit.Assert.*;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.model.Book;

public class FunzionaSpring {

	@Test
	public void scopriamolo() {
		try (ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring/provaBeans.xml")) {

			Book b = (Book) ctx.getBean("caccapupu");

			System.out.println(b.getTitle());
			
			assertTrue(true);
		}
	}
}
