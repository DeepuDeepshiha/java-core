package com.learning.core.day5;
import java.util.ArrayList;
import java.util.Scanner;

public class D05P02{
	public static void main(String[] args)
	{
		String str1=new String();
		String str2=new String();
		ArrayList<String> list= new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			str1=sc.next();
			list.add(str1);
		}
		str2=sc.next();
		
		if(list.contains(str2)==true)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.print("Not Found");
		}
	}
	
}
