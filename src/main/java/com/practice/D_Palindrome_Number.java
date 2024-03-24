package com.practice;

import java.util.Scanner;

public class D_Palindrome_Number 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int orig = num;
		
		int rev = 0; 
		while(num != 0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println("Original Number: "+orig);
		System.out.println("Reversed Number: "+rev);
		
		if(orig == rev)
		{
			System.out.println(orig+ " is PALINDROME");
		}
		else
		{
			System.out.println(orig+" is NOT PALINDROME");
		}
		
		sc.close();
	}

}
