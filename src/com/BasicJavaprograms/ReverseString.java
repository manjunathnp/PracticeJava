package com.BasicJavaprograms;

import java.util.Scanner;

public class ReverseString 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.next();
		
		int len = str.length();
		String rev = "";
		
		/*
		// Using StringBuffer()
		StringBuffer sb = new StringBuffer(str);
		StringBuffer rev = sb.reverse();
		 */
		
		/*
		// Using charAt()
		
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		*/
		
		// Using toCharArray()
		char a[] = str.toCharArray();
		for(int i=len-1; i>=0; i--)
		{
			rev = rev + a[i];
		}
		
		System.out.println("Reversed String: "+rev);
		
		if(str.equalsIgnoreCase(rev.toString()))
		{
			System.out.println("String is PALINDROME");
		}
		else
		{
			System.out.println("String is NOT PALINDROME");
		}

	}

}
