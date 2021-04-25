package com.basicprograms;

import java.util.Scanner;

public class EvenOddList 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the type = 0: Even | 1: Odd");
		int type = sc.nextInt();
		
		System.out.println("Enter the limit: ");
		int limit = sc.nextInt();
		
		if(type == 0)
		{
			for(int i=1; i<=limit; i++)
			{
				if(i%2 == 0)
				{
					System.out.println(i);
				}
			}
		}
		else
		{
			for(int i=1; i<=limit; i++)
			{
				if(i%2 != 0)
				{
					System.out.println(i);
				}
			}
		}
		
		
		
		
		

	}

}
