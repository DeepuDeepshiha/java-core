package com.learning.core.day6;
import java.util.*;
public class D06P03 {
	
	public static void main(String[] args)
	{
		TreeSet<Book1>ts=new TreeSet<Book1>();
		Book1 b1=new Book1(1001,"Python Learning",715,new Date(2020,2,2),"Martic C. Brown");
		Book1 b2=new Book1(1002,"Modern Mainframes",295,new Date(1997,5,19),"Sharad");
		Book1 b3=new Book1(1003,"Java Programming",523,new Date(1984,11,23),"Gilad Bracha");
		Book1 b4=new Book1(1004,"Read C++",715,new Date(1984,11,19),"Henry Harvin");
		Book1 b5=new Book1(1005,".Net Platform",3497,new Date(1984,3,6),"Mark J.Price");
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		for(Book1 b:ts)
		{
			System.out.println(b);
		}
	}

}
