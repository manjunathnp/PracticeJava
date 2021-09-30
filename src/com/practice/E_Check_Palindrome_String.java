package com.practice;

import java.util.Scanner;

public class E_Check_Palindrome_String
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine(); 
		String orig = str;
		
		String rev = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		if(orig.equals(rev))
		{
			System.out.println("PALINDROME");
		}
		else
		{
			System.out.println("NOT PALINDROME");
		}
		
		sc.close();
	}

}
