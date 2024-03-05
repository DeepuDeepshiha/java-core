package javacore.day02;

import java.util.Scanner;

public class D02P11 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		 for (int i = 1; i <= num; i++) {
		      //Loop to iterate over each column of the ith row
		      for (int j = 1; j <= i; j++) {
		        System.out.print(i + " ");
		      }
		      System.out.println();
		    }
	}

}
