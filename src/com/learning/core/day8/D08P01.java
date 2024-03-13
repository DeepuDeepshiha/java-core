package com.learning.core.day8;

import java.util.Scanner;

public class D08P01 {
	public static void main(String[] args)
	{
		Queue q=new Queue(4);
		System.out.println("Enter elements: ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			q.enqueue(sc.nextInt());
		}
		/*System.out.println("Elements in queue: ");
		for(int i=0;i<4;i++)
		{
			System.out.print(q.dequeue()+" ");
		}*/
		System.out.println("After removing first element: ");
		q.dequeue();
		for(int i=0;i<3;i++)
		{
			System.out.print(q.dequeue()+" ");
		}
	}

}
