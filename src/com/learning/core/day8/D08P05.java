package com.learning.core.day8;
import java.util.Scanner;
public class D08P05 {
	public static void main(String[] args)
	{
		Queue q=new Queue(7);
		Queue arr[]=new Queue [2];
		Queue oddqueue=new Queue(7);
		Queue evenqueue=new Queue(7);
		System.out.println("enter 7 numbers: ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<7;i++)
		{
			q.enqueue(sc.nextInt());
		}
		while(!q.isEmpty())
		{
			int data=q.dequeue();
			if(data%2 != 0)
			{
				oddqueue.enqueue(data);
			}
			else
			{
				evenqueue.enqueue(data);
			}
		}
		arr[0]=oddqueue;
		arr[1]=evenqueue;
		System.out.println("Odd Numbers: ");
		oddqueue.display();
		System.out.println("Even Numbers: ");
		evenqueue.display();
		
	}

}
