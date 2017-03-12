package com.model;

public class Book {
	String id;
	String title;
	String edition; //can be null, default null
	String author;
	int year; //can be null, default null
	String publisher;
	int page_number; //can be null, default null
	String description; //can be null, default null;
	int category_id;
	
	public Book() {
		super();
	}
	
	public Book(String id, String title, String edition, String author, int year, String publisher, int page_number,
			String description, int category_id) {
		super();
		this.id = id;
		this.title = title;
		this.edition = edition;
		this.author = author;
		this.year = year;
		this.publisher = publisher;
		this.page_number = page_number;
		this.description = description;
		this.category_id = category_id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPage_number() {
		return page_number;
	}
	public void setPage_number(int page_number) {
		this.page_number = page_number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	
	
}
