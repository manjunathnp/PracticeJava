package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class F_Anagram 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String_1: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the String_2: ");
		String str2 = sc.nextLine();
		
		String s1 = str1.toLowerCase();
		String s2 = str2.toLowerCase();
		
		if(s1.length() == s2.length())
		{
			char[] st1 = s1.toCharArray();
			char[] st2 = s2.toCharArray();
			
			 Arrays.sort(st1);
			 Arrays.sort(st2);
			 
			 boolean result = Arrays.equals(st1, st2);
			 
			 if(result)
				 System.out.println("ANAGRAM");
			 else
				 System.out.println("NOT ANAGRAM");
			
		}
		else
		{
			System.out.println("NOT ANAGRAM");
		}
		
		sc.close();
	}

}
