package com.dao;

import java.util.Collection;

import com.model.User;

public class UserDao extends AbstractHibernateDao<User, String, User> {//// implements DaoInterface<Book, String>{

	public UserDao(){
		super(User.class);
	}

	@Override
	public Collection<User> view(User desc) {
		// TODO Auto-generated method stub
		return null;
	}
}
