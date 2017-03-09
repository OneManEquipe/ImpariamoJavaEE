package com.model;

import java.sql.Date;

public class Loan {

	int id;
	Date d_from;
	Date d_to; //can be null, default null
	String user_id;
	String book_id;
}
