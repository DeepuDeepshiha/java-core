package com.learning.core.day02;

import java.util.Scanner;

public class D02P07 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		if(p>=60 && p<=100)
		{
			System.out.println("Grade A");
		}
		else if(p>=45 && p<60)
		{
			System.out.println("Grade B");
		}
		else if(p>=35 && p<45)
		{
			System.out.println("Grade C");
		}
		else if(p<35)
		{
			System.out.println("Fail");
		}
	}

}
