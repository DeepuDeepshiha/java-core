package com.learning.core.day2;

import java.util.Scanner;

public class D02P17 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int x, y, flg;
        for (x = 1; x <= num; x++) {
        	
            if (x == 1 || x == 0)
            {
            	continue;
            }
                
            flg = 1;
 
            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }
            if (flg == 1)
                System.out.print(x + " ");
        }
	}

}
