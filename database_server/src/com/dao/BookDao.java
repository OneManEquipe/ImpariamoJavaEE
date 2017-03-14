package com.dao;

import java.util.Collection;

import com.model.Book;

public class BookDao implements DaoInterface<Book, String>{

	@Override
	public boolean save(Book bean) {
		
		return false;
	}

	@Override
	public boolean delete(String desc) {
		
		return false;
	}

	@Override
	public boolean update(Book bean) {
		
		return false;
	}

	@Override
	public Collection<Book> view(String desc) {
		
		return null;
	}

	
}
