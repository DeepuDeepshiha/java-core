package com.learning.core.day7;

public class Stack {
	int n;
	int arr[];
	int top;
	public Stack(int num)
	{
		this.n=num;
		this.arr=new int[n];
		this.top=-1;
	}
	public boolean isFull()
	{
		return top==n-1;
		
	}
	public  boolean isEmpty()
	{
		return top==-1;
		
	}
	public void push(int data)
	{
		if(isFull())
		{
			System.out.println("Hello world java Programming");
		}
		else
		{
			top++;
			arr[top]=data;
		}
	}
	public int pop()
	{
		int data;
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return -1;
		}
		else
		{
			data=arr[top];
			top--;
			System.out.print("Hello world java");
			return data;
		}
	}

}
