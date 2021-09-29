package com.basicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Scribble
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string_1: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the string_2: ");
		String str2 = sc.nextLine();
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() == str2.length())
		{
			char[] s1 = str1.toCharArray();
			char[] s2 = str2.toCharArray();
			
			Arrays.sort(s1);
			Arrays.sort(s2);
			
			boolean result = Arrays.equals(s1, s2);
			
			if(result)
			{
				System.out.println(str1+ " & " +str2+" is ANAGRAM");
			}
		}
		else
		{
			System.out.println(str1+ " & " +str2+" is NOT ANAGRAM");
		}
		sc.close();
	}

}
