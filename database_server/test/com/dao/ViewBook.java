package com.dao;

import java.util.Collection;
import org.junit.Test;
import com.model.Book;

public class ViewBook {

	@Test
	public void TestBookDao () {
		
		BookDao bookDao = new BookDao();
		Book b = new Book();
		b.setId("9789997490247");
		
		Collection<Book> res = bookDao.view(b);
		System.out.println("trovati " + res.size() + " libri");
		for(Book c: res) {
			System.out.println("ciclo");
			System.out.println("ID: " + c.getId()+ c.getAuthor());
		}
	}
}
