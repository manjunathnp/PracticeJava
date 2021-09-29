package com.basicprograms;

import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number for which Fibonacci Series to display: ");
		int num = sc.nextInt();
		
		int n1 = 0;
		int n2 = 1;
		
		for(int i=1; i<=num; i++)
		{
			System.out.print(n1+" ");
			
			int sum = n1+n2;
			n1 = n2;
			n2 = sum;
			
		}	
		
		
		sc.close();
		
		
	}
}
