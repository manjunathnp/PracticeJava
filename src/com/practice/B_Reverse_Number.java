package com.practice;

import java.util.Scanner;

public class B_Reverse_Number 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int rev = 0;
		
		while(num != 0)
		{
			rev = rev*10 + num%10;
			num = num / 10;
			 
		}
		System.out.println("Reversed Number: "+rev);
		
		
		
		
		sc.close();
	}

}
