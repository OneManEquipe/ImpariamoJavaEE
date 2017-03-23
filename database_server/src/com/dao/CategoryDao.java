package com.dao;

import java.util.Collection;

import com.model.Category;

public class CategoryDao extends AbstractHibernateDao<Category, Integer, String> {
	
	public CategoryDao(){
		super(Category.class);
	}

	@Override
	public Collection<Category> view(String desc) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
