package com.practice;

import java.util.Scanner;

public class K_Fibonacci_Series 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the limit: ");
		Scanner sc = new Scanner(System.in);
		int limit = sc.nextInt();
		
		int n1 = 0;
		int n2 = 1;
		int sum = 0;
		
		System.out.print(n1+" "+n2);
		for(int i=2; i<=limit; i++)
		{
			sum = n1+n2;
			System.out.print(" "+sum);
			n1 = n2;
			n2 = sum;
		}
		sc.close();
	}

}
