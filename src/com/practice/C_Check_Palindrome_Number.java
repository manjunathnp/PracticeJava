package com.practice;

import java.util.Scanner;

public class C_Check_Palindrome_Number {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int original_num = sc.nextInt();
		
		int num = original_num;
		int rev = 0;
		
		while(num != 0)
		{
			rev = rev*10+num%10;
			num = num/10;
		}
		
		if(rev == original_num)
		{
			System.out.println(original_num+" is PALINDROME");
		}
		else
		{
			System.out.println(original_num+ " is NOT PALINDROME");
		}
		
		sc.close();
	}

}
