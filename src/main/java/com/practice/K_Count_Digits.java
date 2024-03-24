package com.practice;

import java.util.Scanner;

public class K_Count_Digits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		int orig = num;
		int count = 0;
		
		while(num != 0)
		{
			num = num/10;
			count++;
		}
		
		System.out.println("Count of Digits in "+orig+" = "+count);
				
		sc.close();
		
	}

}
