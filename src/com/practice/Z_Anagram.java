package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Z_Anagram {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String_1: ");
		String str1 = sc.nextLine().toLowerCase();
		
		System.out.println("Enter the String_2: ");
		String str2 = sc.nextLine().toLowerCase();
		
		boolean status = true;
		if(str1.length() == str2.length())
		{
			char[] s1 = str1.toCharArray();
			char[] s2 = str2.toCharArray();
			
			Arrays.sort(s1);
			Arrays.sort(s2);
			
			status = Arrays.equals(s1, s2);
			
		}
		else
		{
			status = false;
		}
		if(status)
			System.out.println("Both Strings are ANAGRAM");
		else
			System.out.println("Both Strings are NOT ANAGRAM");
		
		
		
		
	}

}
