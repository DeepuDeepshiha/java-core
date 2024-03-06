package javacore.day03;

import java.util.Scanner;
import java.util.Arrays;

public class D03P02 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 2 numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		//int arr[]=new int[5];
		int arr1[]=new  int[5];
		System.out.print("Enter 5 numbers: ");
		for(int i=0;i<5;i++)
		{
			arr1[i]=sc.nextInt();
		}
		//arr[]=Arrays.toString(arr1));
		
		if((a>=1 && a<=40) && (b>=1 && b<=40))
		{
			int res1=Arrays.binarySearch(arr1, a);
			int res2=Arrays.binarySearch(arr1, b);
			System.out.println(res1+" "+res2);
			if(res1>=0 && res2>=0)
			{
				System.out.print("Bingo");
			}
			else
			{
				System.out.print("Not found");
			}
		}
		
		
	}

}
