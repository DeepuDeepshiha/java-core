package com.learning.core.day02;

import java.util.Scanner;

public class D02P08 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		int res=0;
		for(int i=l;i<=r;i++)
		{
			res=res+i;
		}
		System.out.println(res);
	}

}
