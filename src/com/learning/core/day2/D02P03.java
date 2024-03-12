package com.learning.core.day2;

import java.util.Scanner;

public class D02P03 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double res;
		char op=sc.next().charAt(0);
		if(op=='+')
		{
			res=a+b;
			System.out.println(res);
		}
		if(op=='-')
		{
			res=a-b;
			System.out.println(res);
		}
		if(op=='*')
		{
			res=a*b;
			System.out.println(res);
		}
		if(op=='/')
		{
			res=a/b;
			System.out.println(res);
		}
		if(op=='%')
		{
			res=a%b;
			System.out.println(res);
		}
		
	}

}
