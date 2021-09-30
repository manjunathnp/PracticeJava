/*
 	Program: To find the Factorial of a given number
 	Author: Manjunath N P

*/
package com.basicjavacodes;

import java.util.Scanner;

public class FactorialNumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of 'n' to find the factorial: ");
		int n = sc.nextInt();
		int fact = 1;
		
		for(int i=1; i<=n; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial of "+n+": "+fact);
	}

}
