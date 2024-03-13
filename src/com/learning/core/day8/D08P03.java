package com.learning.core.day8;
import java.util.Scanner;
public class D08P03 {
	public static void main(String[] args)
	{
		CircularQueue c=new CircularQueue(4);
		System.out.println("Enter the Elements: ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			c.enqueue(sc.nextInt());
		}
		/*System.out.println("Elements in Circular Queue: ");
		for(int i=0;i<4;i++)
		{
			System.out.print(c.dequeue()+" ");
		}*/
		c.dequeue();
		System.out.println("After removing the first element: ");
		for(int i=0;i<3;i++)
		{
			System.out.print(c.dequeue()+" ");
		}
	}

}
