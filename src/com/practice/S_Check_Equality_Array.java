package com.practice;

public class S_Check_Equality_Array 
{
	public static void main(String[] args) 
	{
		int[] a = {1, 2, 3, 4, 5, 6};
		int[] b = {1, 2, 3, 4, 5, 6};
		
		/*
		boolean status = Arrays.equals(a, b);
		if(status)
			System.out.println("Two arrays are equal");
		else
			System.out.println("Two arrays are unequal");
		*/
		
		boolean status = true;
		if(a.length == b.length)
		{
			for(int i=0; i<a.length; i++)
			{
				if(a[i] != b[i])
					status = false;
			}
		}
		else
		{
			status = false;
		}
		if(status)
			System.out.println("Two arrays are equal");
		else
			System.out.println("Two arrays are unequal");
		
	}
	

}
