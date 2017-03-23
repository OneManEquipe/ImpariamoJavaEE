package com.dao;

import java.util.Collection;

import com.model.Loan;

public class LoanDao extends AbstractHibernateDao<Loan, String, String> {
	
	public LoanDao(){
		super(Loan.class);
	}

	@Override
	public Collection<Loan> view(String desc) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
