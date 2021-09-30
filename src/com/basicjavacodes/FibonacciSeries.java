/*
	Program: Fibonacci Series
	Author: Manjunath N P
*/
package com.basicjavacodes;

import java.util.Scanner;

public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of 'n': ");
		int n = sc.nextInt();
		
		int a = 0; int b = 1;
		
		System.out.println("Fibonacci Series of "+n+":");
		for(int i=1; i<=n; i++)
		{
			System.out.print(a+ " ");
			
			int c = a+b;
			a = b;
			b = c;
			
		}
			
	}

}
