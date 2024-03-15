package com.learning.core.day10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class D10P02{
	public static void main(String[] args)
	{
		Student s=new  Student(1001,"Sasha",25,"London");
		 ValidatorStudent v= new  ValidatorStudent();
		 try
		 {
			 boolean name=v.checkname(s.getName());
			 boolean address=v.checkadd(s.getAddress());
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Whether to write the data in a file: expecting true/false");
			 boolean ans=sc.nextBoolean();
			 if(ans==true)
			 {
				 try 
				 {
					FileOutputStream f=new FileOutputStream("Testser.txt");
					ObjectOutputStream o=new ObjectOutputStream(f);
					o.writeObject(s);
					o.flush();
					o.close();
					
				 }
				 catch (Exception e) 
				 {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		 }
		 catch(nameexception | addressexception e)
		 {
			 e.printStackTrace();
		 }
	}
		
	

}
