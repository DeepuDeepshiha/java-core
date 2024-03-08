package com.learning.core.day02;

import java.util.Scanner;

public class D02P10 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int rev=0;
		int r;
		while(num!=0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		System.out.println(rev);
	}

}
