package com.learning.core.day6;
//import java.util.Map.Entry;
import java.util.Date;
import java.util.TreeSet;
//import java.util.Map.Entry;

public class D06P03 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		TreeSet<Book>ts=new TreeSet<Book>();
		//@SuppressWarnings("deprecation")
		Book b1=new Book(1001,"Python Learning",715,new Date(2020,2,2),"Martic C. Brown");
		Book b2=new Book(1002,"Modern Mainframes",295,new Date(1997,5,19),"Sharad");
		Book b3=new Book(1003,"Java Programming",523,new Date(1984,11,23),"Gilad Bracha");
		Book b4=new Book(1004,"Read C++",715,new Date(1984,11,19),"Henry Harvin");
		Book b5=new Book(1005,".Net Platform",3497,new Date(1984,3,6),"Mark J.Price");
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		for(Book b:ts)
		{
			System.out.println(b);
		}
	}

}
