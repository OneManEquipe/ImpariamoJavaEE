package com.dao;

import java.util.Collection;

import com.model.Role;

public class RoleDao extends AbstractHibernateDao<Role, String, String> {
	
	public RoleDao(){
		super(Role.class);
	}

	@Override
	public Collection<Role> view(String desc) {
		// TODO Auto-generated method stub
		return null;
	}
}
