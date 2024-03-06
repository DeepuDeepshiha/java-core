package javacore.day03;
import java.util.Arrays;
import java.util.Scanner;

public class D03P04{
	
	public static int repeat(int arr[], int n) {
		
		for (int i = 0; i < n; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				if (arr[i] == arr[j])
				{
					return i;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int index = repeat(arr, num);
		if (index == -1)
		{
			System.out.println("No repeating element found!");
		}
		else 
		{
			System.out.println("First repeating element is " + arr[index]);
		}
	}
}
