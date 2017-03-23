package com.dao;

import java.io.UncheckedIOException;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Book;

public class BookDao extends AbstractHibernateDao<Book, String, Book> {//// implements DaoInterface<Book, String>{

	
	public BookDao(){
		super(Book.class);
	}

	@Override
	public Collection<Book> view(Book desc) {
		String hql = "from Book as b where b.id = :id OR "
				+ "b.title = :title OR "
				+ "b.edition = :edition OR "
				+ "b.author = :author OR "
				+ "b.year = :year OR "
				+ "b.publisher = :publisher OR "
				+ "b.page_number = :page_number OR "
				+ "b.description = :description OR "
				+ "b.category = :category";
		
		Session session = (Session) context.getBean("session");

		List<Book> books;
		
		Transaction transaction = session.beginTransaction();
		
		books = (List<Book>)session.createQuery(hql)
			.setParameter("id", desc.getId())
			.setParameter("title", desc.getTitle())
			.setParameter("edition", desc.getEdition())
			.setParameter("author", desc.getAuthor())
			.setParameter("year", desc.getYear())
			.setParameter("publisher", desc.getPublisher())
			.setParameter("page_number", desc.getPage_number())
			.setParameter("description", desc.getDescription())
			.setParameter("category", desc.getCategory()).list();
		transaction.commit();
		return books;
	}	
}
