package com.model;

public class Book {
	String id;
	String title;
	String edition; //can be null, default null
	String author;
	Integer year; //can be null, default null
	String publisher;
	Integer page_number; //can be null, default null
	String description; //can be null, default null;
	Category category;
	
	public Book() {
		super();
	}
	
	public Book(String id, String title, String edition, String author, Integer year, String publisher, Integer page_number,
			String description, Category category) {
		super();
		this.id = id;
		this.title = title;
		this.edition = edition;
		this.author = author;
		this.year = year;
		this.publisher = publisher;
		this.page_number = page_number;
		this.description = description;
		this.category = category;
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
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Integer getPage_number() {
		return page_number;
	}
	public void setPage_number(Integer page_number) {
		this.page_number = page_number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", edition=" + edition + ", author=" + author + ", year=" + year
				+ ", publisher=" + publisher + ", page_number=" + page_number + ", description=" + description
				+ ", category=" + category + "]";
	}
	
	
}
