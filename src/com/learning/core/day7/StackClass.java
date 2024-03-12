
package com.learning.core.day7;

public class StackClass {
	int n;
	int arr[];
	int top;
	public StackClass(int num)
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
			System.out.println("Stack is Full");
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
			return 0 ;
		}
		else
		{
			data=arr[top];
			top--;
			return data;
		}
	}
	public void getmin()
	{
		int min=arr[0];
		if(isEmpty())
		{
			System.out.println("Stack empty");
		}
		else
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]<min)
				{
					min=arr[i];
				}
			}
			System.out.println(min);
		}
	}
	
	public void reverse()
    {
  	  if(isEmpty())
  	  {
  		  System.out.println("Stack is Empty");
  	  }
  	  else
  	  {
  		  int[] rev = new int[arr.length];  
  		  int index = 0;
  		  
  		  while(!isEmpty())
  		  {
  			  int temp = pop();
  			  rev[index] = temp;
  			  index++;
  		  }
  		  
  		  for(int i=0;i<index;i++)
  		  {
  			  push(rev[i]);
  			  System.out.println(rev[i]);
  		  }
  	  }
    }
  	  

}

