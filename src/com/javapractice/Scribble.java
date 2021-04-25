package com.javapractice;

import java.util.Scanner;

public class Scribble 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		sb.reverse();
		String rev = sb.toString();
		String nums = Integer.toString(num);
		
		System.out.println(nums);
		System.out.println(rev);
		
		if(nums.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Non-Palindrome");
		}
	}

}
