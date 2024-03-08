package com.learning.core.day02;

import java.util.Scanner;

public class D02P15 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("How many numbers you want to print:");
		int num1=sc.nextInt();
		int p=0,n=0,z=0;
		System.out.print("Enter the numbers:");
		for(int i=1;i<=num1;i++)
		{
			int num2=sc.nextInt();
			if(num2>0)
			{
				p=p+1;
			}
			else if(num2<0) 
			{
				n=n+1;
			}
			else
			{
				z=z+1;
			}
		}
		System.out.println("Number of positives: "+p);
		System.out.println("Number of negatives: "+n);
		System.out.println("Number of zeroes: "+z);
	}

}
