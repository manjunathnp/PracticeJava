package com.practice;

import java.util.Scanner;

public class G_Fibonacci 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit: ");
		int limit = sc.nextInt();
		
		int n1 = 0, n2 = 1, sum = 0;
		for(int i=1; i<=limit; i++)
		{
			System.out.print(n1+ " ");
			sum = n1+n2;
			n1 = n2;
			n2 = sum;
			
		}
		
		sc.close();
	}

}
