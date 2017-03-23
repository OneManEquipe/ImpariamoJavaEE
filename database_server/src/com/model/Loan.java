package com.model;

import java.sql.Date;

public class Loan {

	Integer id;
	Date d_from;
	Date d_to; //can be null, default null
	User user;
	Book book;
	
	public Loan() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getD_from() {
		return d_from;
	}

	public void setD_from(Date d_from) {
		this.d_from = d_from;
	}

	public Date getD_to() {
		return d_to;
	}

	public void setD_to(Date d_to) {
		this.d_to = d_to;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Loan [id=" + id + ", d_from=" + d_from + ", d_to=" + d_to + ", user=" + user + ", book=" + book + "]";
	}
	
}
