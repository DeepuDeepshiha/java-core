package com.learning.core.day7;
import java.util.Scanner;
public class D07P01 {
	public static void main(String[] args)
	{
		Stack S=new Stack(4);
		System.out.println("Enter 4 numbers: ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=4;i++)
		{
			int n=sc.nextInt();
			S.push(n);
		}
		for(int i=0;i<=4;i++)
		{
			int p=S.pop();
			System.out.println(" "+p);
		}
	}

}
