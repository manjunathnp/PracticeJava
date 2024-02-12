package com.practice;

public class T_Missing_Array_Number 
{
	public static void main(String[] args)
	{
		int a[] = {1, 2, 4, 5, 6, 7};
		int a_sum = 0;
		int sum = 0;
		
		for(int i=0; i<a.length; i++)
		{
			a_sum = a_sum + a[i];
		}
		
		for(int i=1; i<=7; i++)
		{
			sum = sum + i;
		}
		
		int missing_num = sum - a_sum;
		System.out.println("Missing number: "+missing_num);
		
	}

}
