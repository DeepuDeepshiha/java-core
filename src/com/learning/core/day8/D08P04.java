package com.learning.core.day8;

import java.util.Scanner;

public class D08P04 {
	public static void main(String[] args)
	{
		QueueString q=new QueueString(4);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			q.enqueue(sc.next());
		}
		if(!q.isEmpty())
		{
			System.out.println("Not Empty");
		}
		else
		{
			System.out.println("Empty");
		}
	}

}
