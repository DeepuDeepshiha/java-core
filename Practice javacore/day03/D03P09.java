package javacore.day03;

import java.util.Scanner;

public class D03P09 {
	
	public static void formChain(String[] s) 
	{
        int n = s.length;
        int[] visited = new int[n];
        int[] next = new int[n];

        for (int i = 0; i < n; i++)
        {
            next[i] = -1;
            visited[i] = 0;
        }

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++)
            {
                if (s[i].charAt(s[i].length() - 1) == s[j].charAt(0) && visited[j] == 0) 
                {
                    next[i] = j;
                    visited[j] = 1;
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++)
        {
            if (next[i] != -1) 
            {
                System.out.println("yes");
                System.out.println(s[i] + " " + s[next[i]]);
            }
            else 
              {
                  System.out.println("no");
               }
        }
    }

    public static void main(String[] args)
    {
        String[] str = {"abc", "efg", "cde", "ghi", "ija"}; // Example array of strings
        formChain(str);
    }

}