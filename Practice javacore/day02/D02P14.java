package javacore.day02;

import java.util.Scanner;

public class D02P14 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=1;
		while(b>0)
		{
			res=res*a;
			b--;
		}
		System.out.print(res);
	}

}
