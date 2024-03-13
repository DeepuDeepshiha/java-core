package com.learning.core.day8;

public class Queue {
	int n;
	int arr[];
	int front;
	int rear;
	public Queue(int n)
	{
		this.n=n;
		arr=new int[n];
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
	public void enqueue(int data)
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
	public int dequeue()
	{
		int value;
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
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
