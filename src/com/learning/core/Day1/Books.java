package com.learning.core.day1;

public class Books {
	String booktitle;
	double bookprice;
	public Books() {
		super();
	}
	public Books(String booktitle, double bookprice) {
		super();
		this.booktitle = booktitle;
		this.bookprice = bookprice;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public double getBookprice() {
		return bookprice;
	}
	public void setBookprice(double bookprice) {
		this.bookprice = bookprice;
	}
	

}
