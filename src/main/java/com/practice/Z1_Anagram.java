package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Z1_Anagram 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String_1: ");
		String str1 = sc.nextLine().toLowerCase();
		
		System.out.println("Enter the String_2: ");
		String str2 = sc.nextLine().toLowerCase();
		
		if(str1.length() == str2.length())
		{
			char[] s1 = str1.toCharArray();
			char[] s2 = str2.toCharArray();
			
			Arrays.sort(s1);
			Arrays.sort(s2);
			
			boolean result = Arrays.equals(s1, s2);
			if(result)
			{
				System.out.println("Anagram");
			}
 		}
		else
		{
			System.out.println("Not Anagram");
		}
		
		sc.close();
	}

}
