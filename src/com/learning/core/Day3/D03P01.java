package com.learning.core.day3;

import java.util.Scanner;
import java.util.Arrays;
public class D03P01 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int i=0,j=str.length()-1;
		boolean check;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				check=false;
				
			}
			i++;
			j--;
		}
		check=true;
		if(check==true)
		{
			System.out.println(" It is a Palindrome");
		}
		else
		{
			System.out.println(" It is not a Palindrome");
		}
	}
		

}
