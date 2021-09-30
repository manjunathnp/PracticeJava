package com.basicjavacodes;

import java.util.Scanner;

public class AddInputDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number between 0 and 1000: ");
		int num = sc.nextInt();
		if(num<0|| num>1000)
		{
			System.out.println("Invalid Option Enter ... Retry!");
			System.exit(1);
			
		}
		else
		{
			int sum = 0;
			int number = num;
			while (number > 0)
			{
				sum = sum + (number % 10);
				number = number/10;
			}
					
			System.out.println("Sum of "+num+" digits = "+sum);
		}
		
	}

}
