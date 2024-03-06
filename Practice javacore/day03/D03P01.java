package javacore.day03;

import java.util.Scanner;
import java.util.Arrays;
public class D03P01 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuilder sb=new StringBuilder(str);
		StringBuilder s=sb.reverse();
		boolean b= s.equals(sb.toString());
		if(b==true)
		{
			System.out.print(" It is a Palindrome");
		}
		else
		{
			System.out.print(" It is not a Palindrome");
		}
		System.out.print("length :"+str.length()+ " Upper case: "+ str.toUpperCase());
	}
		

}
