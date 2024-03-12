package com.learning.core.day2;

import java.util.Scanner;

public class D02P02 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num>0)
		{
			for(int i=1;i<=num;i++)
			{
				if(i%2==0)
				{
					System.out.println(i+" ");
				}
			}
		}
		
	}

}
