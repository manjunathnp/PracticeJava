package com.practice;

public class U_Duplicates_Array 
{

	public static void main(String[] args)
	{
		String[] a = {"Java", "C", "C#", "C++", "C"};
		
		boolean status = false;
		
		System.out.println("Duplicate: ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] == a[j])
				{
					System.out.println(a[i]);
					status = true;
				}
				
			}
		}
		if(status = false)
		{
			System.out.println("No Duplicates");
		}
	}

}
