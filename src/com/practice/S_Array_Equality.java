package com.practice;

public class S_Array_Equality 
{

	public static void main(String[] args) 
	{
		int[] a = {1, 2, 3, 6, 8, 9};
		int[] b = {1, 2, 3, 6, 8, 9};
		
		/*
		boolean res = Arrays.equals(a, b);
		if(res)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are unequal");
		*/
		
		boolean status = true;
		if(a.length == b.length)
		{
			for(int i=0; i<a.length; i++)
			{
				if(a[i] != b[i])
				{
					status = false;
				}
			}
		}
		else
		{
			status = false;
		}
		
		if(status == true)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are unequal");
		
	}

}
