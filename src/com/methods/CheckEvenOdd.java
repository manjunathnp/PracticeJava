package com.methods;

import java.util.Scanner;

public class CheckEvenOdd 
{
	public static void checkEvenOdd(int num)
	{
		String evenodd = (num%2 == 0) ? "Even Number": "Odd Number";
		System.out.println(num + " is "+ evenodd);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		sc.close();
		
		checkEvenOdd(number);

	}
}
