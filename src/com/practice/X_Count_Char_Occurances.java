package com.practice;

import java.util.Scanner;

public class X_Count_Char_Occurances 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.println("Enter the character: ");
		String ch = sc.next();
		
		charCount(str, ch);
		
		sc.close();
	}
	
	private static void charCount(String s, String c)
	{	
		int strLen = s.length();
		int chRepLen = s.replaceAll(c, "").length();
		int countAfterReplacement = strLen - chRepLen;
		System.out.println("Occurances of "+c+" : "+countAfterReplacement);
	}

}
