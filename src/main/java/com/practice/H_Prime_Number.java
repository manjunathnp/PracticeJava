package com.practice;

import java.util.Scanner;

public class H_Prime_Number 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int count = 0;
		
		if(num > 0)
		{
			for(int i=1; i<=num; i++)
			{
				if(num%i == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.println(num + " is a PRIME NUMBER");
			}
			else
			{
				System.out.println(num+ " is NOT PRIME NUMBER");
			}
				
		}
		else
		{
			System.out.println("Invalid Input");
		}
		sc.close();
	}

}
