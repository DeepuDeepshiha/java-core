package com.learning.core.day10;

public class D10P09 {
	public static int findmax(int arr[])
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0 && arr[i]>max)
			{
				max=arr[i];
			}
			else
			{
				max=arr[0];
				for(i=1;i<arr.length;i++)
				{
					if(arr[i]>max)
					{
						max=arr[i];
					}
				}
			}
		}
		return max;
	}
	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6};
		findmax(arr);
	}

}
