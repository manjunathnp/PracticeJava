package com.methods;

import java.util.Scanner;

public class Palindrome_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int number = sc.nextInt();
		
		sc.close();
		
		checkPalindromeNum(number);
	}
	
	static void checkPalindromeNum(int num)
	{
		int original_num = num;
		int rev = 0;
		while(num != 0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		if(rev == original_num)
		{
			System.out.println(original_num+" Palindrome");
		}
		else
		{
			System.out.println(original_num+" Not a Palindrome");
		}
	}

}
