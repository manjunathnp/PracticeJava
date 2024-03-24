package com.practice;

import java.util.Scanner;

public class E_Palindrome_String 
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
		System.out.println("Original String: "+orig);
		System.out.println("Reversed String: "+rev);
		
		if(orig.equalsIgnoreCase(rev))
		{
			System.out.println(orig+ " >> is PALINDROME ");
			
		}
		else
		{
			System.out.println(orig+ " >> is NOT PALINDROME");
		}
		sc.close();
	}

}
