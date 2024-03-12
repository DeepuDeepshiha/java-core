package com.learning.core.day6;

import java.util.Date;
import java.util.Objects;

public class Book{
	int bookid;
	String booktitle;
	double price;
	Date dateofpublication;
	String author;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public Book(int bookid, String booktitle, double price, Date dateofpublication, String author) {
		super();
		this.bookid = bookid;
		this.booktitle = booktitle;
		this.price = price;
		this.dateofpublication = dateofpublication;
		this.author = author;
	}
	public Book() {
		super();
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDateofpublication() {
		return dateofpublication;
	}
	public void setDateofpublication(Date dateofpublication) {
		this.dateofpublication = dateofpublication;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, bookid, booktitle, dateofpublication, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && bookid == other.bookid
				&& Objects.equals(booktitle, other.booktitle)
				&& Objects.equals(dateofpublication, other.dateofpublication)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	@Override
	@SuppressWarnings("deprecation")
	public String toString() {
		return bookid + " " + booktitle + " " + price + " "
				+ dateofpublication.getDate()+"/"+dateofpublication.getMonth()+"/"+dateofpublication.getYear() + " " + author ;
	}
	
}
