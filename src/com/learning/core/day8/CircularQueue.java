package com.learning.core.day8;

public class CircularQueue {
	int n;
	int arr[];
	int front;
	int rear;
	public CircularQueue(int n)
	{
		this.n=n;
		arr=new int[n];
		front=-1;
		rear=-1;
	}
	public boolean isEmpty()
	{
		return front==-1 && rear==-1;
	}
	public boolean isFull()
	{
		return ((rear+1)%n==front);
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
			rear=(rear+1)%n;
			arr[rear]=data;
		}
	}
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		else if(rear==front)
		{
			int top=arr[front];
			front=rear=-1;
			return top;
		}
		else
		{
			int top=arr[front];
			front=(front+1)%n;
			return top;
		}
	}

}
