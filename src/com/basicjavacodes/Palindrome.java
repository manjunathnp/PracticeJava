package com.basicjavacodes;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String:");
		String str = sc.nextLine();
		System.out.println("Original String: "+str);
		
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println("Reversed String: "+rev);
		
		if(rev.equalsIgnoreCase(str))
		{
			System.out.println("PALINDROME");
		}
		else
		{
			System.out.println("NOT A PALINDROME");
		}
		
		

	}

}
