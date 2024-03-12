package com.learning.core.day7;
import java.util.Scanner;
public class D07P02 {
	public static void main(String[] args)
	{
		StackLinkedList s=new StackLinkedList();
		System.out.println("Enter 4 numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			s.push(sc.nextDouble());
		}
		System.out.println("The elements of the stack are");
		for(int i=0;i<=4;i++)
		{
			double p=s.pop();
			System.out.println(p);
		}
	}
}
