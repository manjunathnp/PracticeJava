package com.methods;

import java.util.Scanner;

public class SumOfDigits 
{
	static void findSum(int num)
	{
		int number = num;
		int sum = 0;
		while(num !=0)
		{
			sum = sum + num%10;
			num = num/10;
		}
		
		System.out.println("Sum of all the digits in the number "+number+" = "+sum);
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		findSum(num);
		
		
	}

}
