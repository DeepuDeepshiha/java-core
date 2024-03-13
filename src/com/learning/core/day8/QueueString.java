package com.learning.core.day8;
public class QueueString {
	int n;
	String arr[];
	int front;
	int rear;
	public QueueString(int n)
	{
		this.n=n;
		arr=new String[n];
		front=-1;
		rear=-1;
	}
	public boolean isFull()
	{
		return rear==n-1;
	}
	public boolean isEmpty()
	{
		return front==-1 && rear==-1;
	}
	public void enqueue(String data)
	{
		if(isFull())
		{
			System.out.print("Queue is Full");
		}
		else if(isEmpty())
		{
			rear=front=0;
			arr[rear]=data;
		}
		else
		{
			rear++;
			arr[rear]=data;
		}
	}
	public String dequeue()
	{
		String value;
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return null;
		}
		else if(front==rear)
		{
			value=arr[front];
			front=rear=-1;
			return value;
		}
		else
		{
			value=arr[front];
			front++;
			return value;
		}
	}
	public void display()
	{
		for(int i=this.front;i<=this.rear;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
