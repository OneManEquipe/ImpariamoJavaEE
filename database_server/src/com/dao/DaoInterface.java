package com.dao;

import java.util.Collection;

public interface DaoInterface <Tbean, Tid, Tsearch> { //Tbean = Book, Library, ...	Tid = String, float, int, ...

	public boolean save(Tbean bean);
	public boolean delete(Tid desc); 
	public boolean update(Tbean bean);
	public Collection<Tbean> view(Tsearch desc);
}
