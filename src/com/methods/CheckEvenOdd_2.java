package com.methods;

import java.util.Scanner;

public class CheckEvenOdd_2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		
		sc.close();
		
		findEvenOdd(number);
		
	}
	
	static void findEvenOdd(int number)
	{
		if(number%2 == 0)
		{
			System.out.println(number+ " is Even Number");
		}
		else
		{
			System.out.println(number+ " is Odd Number");
		}
	}

}
