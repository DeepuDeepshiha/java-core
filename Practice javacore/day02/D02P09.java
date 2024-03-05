package javacore.day02;

import java.util.Scanner;

public class D02P09 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int res;
		for(int i=1; i<=num;i++)
		{
			res=i*i*i;
			System.out.println(res+" ");
		}
	}
}
