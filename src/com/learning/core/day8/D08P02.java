package com.learning.core.day8;

import java.util.Scanner;

public class D08P02 {
	public static void main(String[] args)
	{
		QueueLinkedList q=new QueueLinkedList();
		System.out.println("Enter elements: ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			q.enqueue(sc.nextInt());
		}
		/*
		System.out.println("Elements in Queue:");
		for(int i=0;i<5;i++)
		{
			System.out.print(q.dequeue()+" ");
		}*/
		System.out.println("After removing 2 elements: ");
		q.dequeue();
		q.dequeue();
		for(int i=0;i<3;i++)
		{
			System.out.print(q.dequeue()+" ");
		}
		
	}

}
