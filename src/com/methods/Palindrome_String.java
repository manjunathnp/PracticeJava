package com.methods;

import java.util.Scanner;

public class Palindrome_String 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.next();
		
		sc.close();
		
		checkPalindromeStr(str);

	}

	static void checkPalindromeStr(String s)
	{
		String original_str = s;
		String rev = "";
		int len = s.length();
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		
		if(rev.equalsIgnoreCase(original_str))
		{
			System.out.println(original_str+ " is PALINDROME");
		}
		else
		{
			System.out.println(original_str+ " is NOT PALINDROME");
		}
	}
}
