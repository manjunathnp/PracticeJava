package com.practice;

public class T_Find_Missing_Number_Array
{

	public static void main(String[] args) 
	{
		int[] a = {1, 2, 3, 4, 5, 7};
		int arrSum = 0;
		int sum = 0;
		
		for(int i=1; i<=7; i++)
		{
			sum = sum + i;
		}
		
		for(int i=0; i<a.length; i++)
		{
			arrSum = arrSum + a[i];
		}
		
		int missingNum = sum - arrSum;
		System.out.println("Missing Number: "+missingNum);
	}

}
