package com.javapractice;

import java.util.Scanner;

public class EvenOrOdd 
{
	static void evenOrOdd(int num)
	{
		if(num % 2 == 0)
		{
			System.out.println("The NUMBER "+num+" is EVEN NUMBER");
		}
		else
		{
			System.out.println("The NUMBER "+num+" is ODD NUMBER");
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		evenOrOdd(num);

	}

}
