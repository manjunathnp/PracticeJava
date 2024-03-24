package com.practice;

import java.util.Scanner;

public class X_Count_Char_Occurances 
{
	private static void countChar(String str, String ch)
	{
		int totalLength = str.length();
		int removeChar = str.replaceAll(ch, "").length();
		int count = totalLength-removeChar;
		System.out.println("Occurances of "+ch+": "+count);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		System.out.println("Enter the Characters: ");
		String ch = sc.next();
		
		countChar(str, ch);
		
		sc.close();
	}

}
