package com.dao;

import java.util.Collection;

import com.model.Library;

public class LibraryDao extends AbstractHibernateDao<Library, String, String> {
	
	public LibraryDao(){
		super(Library.class);
	}

	@Override
	public Collection<Library> view(String desc) {
		// TODO Auto-generated method stub
		return null;
	}
}
