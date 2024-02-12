package com.practice;

import java.util.Scanner;

public class M_Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int orig = num;
		
		int fact = 1;
		for(int i=1; i<=num; i++)
		{
			fact = fact * i;
			
		}
		System.out.println("Factorial of "+orig+" = "+fact);
		
		sc.close();
	}

	

}
