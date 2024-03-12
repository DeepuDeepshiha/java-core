package com.learning.core.day7;
class Node
{
	double value;
	Node next;
}
public class StackLinkedList
{
	Node head;
	public StackLinkedList()
	{
		head=null;
	}
	public void push(double data)
	{
		Node extranode=head;
		head=new Node();
		head.value=data;
		head.next=extranode;
	}
	public boolean isEmpty()
	{
		return head==null;
	}
	public double pop()
	{
		if(isEmpty())
		{
			System.out.println("null");
			return -1;
		}
		else
		{
			double value=head.value;
			head=head.next;
			return value;
		}
		
	}
	

}
