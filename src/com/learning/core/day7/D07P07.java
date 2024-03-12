package com.learning.core.day7;

import java.util.Scanner;

public class D07P07 {
	public static void main(String[] args)
	{
		StackClass S=new StackClass(4);
		int arr[]=new int[4];
		System.out.println("Enter 4 numbers: ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			int n=sc.nextInt();
			S.push(n);
		}
		
		for(int i=0;i<4;i++)
		{
			arr[i]=S.pop();
			//System.out.println(arr[i]);
		}
		if(arr[3]%2==0)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
		
	}

}
