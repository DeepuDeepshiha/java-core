package com.learning.core.day2;

import java.util.Scanner;

public class D02P13 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int res=1;
		for(int i=1;i<=num;i++)
		{
			res=res*i;
		}
		System.out.print("Factorial of 5 is "+res);
	}

}
