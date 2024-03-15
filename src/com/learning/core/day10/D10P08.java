package com.learning.core.day10;

public class D10P08 {
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{
		try
		{
			return a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Not possible");
			e.printStackTrace();
		}
		return -1;
	}
	public static void main(String[] args)
	{
		mul(5,10);
		div(10,2);
	}

}
