package com.dao;

import java.util.Collection;

public interface DaoInterface <Tbean, Tdesc> { //Tbean = Book, Library, ...	Tid = String, float, int, ...

	public boolean save(Tbean bean);
	public boolean delete(Tdesc desc); 
	public boolean update(Tbean bean);
	public Collection<Tbean> view(Tdesc desc);
}
