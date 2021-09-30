package com.basicjavacodes;

public class Prime 
{

	public static void main(String[] args) 
	{
		int n = 51;
		
		if(IsPrime(n))
		{
			System.out.println(n+" is PRIME NUMBER");
		}
		else
		{
			System.out.println(n+" is NOT PRIME NUMBER");
		}
	}
	
	public static boolean IsPrime(int n)
	{
		if(n <= 1)
		{
			return false;
		}
		for(int i = 2; i<=n/2; i++)
		{
			if(n%i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
