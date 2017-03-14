package com.model.hibernateWrappers;

import com.model.Book;

public class WrapperBook extends Book {

	public void setWrapperYear(Integer year) {
		if(year != null) setYear(year.intValue());
	}
	
	public Integer getWrapperYear () {
		return new Integer (getYear());
	}
	
	public void setWrapperPageNumber (Integer pageNumber) {
		if(pageNumber != null) setPage_number(pageNumber.intValue());
	}
	
	public Integer getWrapperPageNumber () {
		return new Integer (getPage_number());
	}
	
	public void setWrapperCategory_id(Integer categoryId) {
		if(categoryId != null) setCategory_id(categoryId.intValue());
	}
	
	public Integer getWrapperCategory_id () {
		return new Integer (getCategory_id());
	}
}
