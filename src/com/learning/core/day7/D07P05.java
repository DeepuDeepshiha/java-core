package com.learning.core.day7;

import java.util.Scanner;

public class D07P05 {
	public static void main(String[]args)
	{
		StackClass s = new StackClass(4);
		System.out.println("Enter 4 numbers: ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			int n=sc.nextInt();
			s.push(n);
		}
		  
		  s.reverse();
		  
	}
}