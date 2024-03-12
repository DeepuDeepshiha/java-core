package com.learning.core.day7;

import java.util.Scanner;

public class D07P06 {
	public static void main(String[] args)
	{
		StackClass S=new StackClass(4);
		int arr[]=new int[4];
		System.out.println("Enter 4 numbers: ");
		Scanner sc=new Scanner(System.in);
		int min=0;
		for(int i=0;i<4;i++)
		{
			int n=sc.nextInt();
			S.push(n);
		}
		S.getmin();
		
	}

}
