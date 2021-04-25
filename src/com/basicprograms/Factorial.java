package com.basicprograms;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number to find its Factorial: ");
		int num = sc.nextInt();
		
		long fact = 1;
		
		for(int i=1; i<=num; i++)
		{
			fact = fact * i;
		}
		
		System.out.println("Factorial of "+num+" = "+fact);

	}

}
