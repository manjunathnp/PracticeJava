package com.practice;

import java.util.Scanner;

public class X_Word_Count 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		/*
		String[] words = str.split("\\s");
		System.out.println("Total Word Count: "+words.length);
		*/
		
		int count=1;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) ==' ' && str.charAt(i+1) !=' ' && i<str.length())
			{
				count++;
			}
		}
		System.out.println("Total Word Count: "+count);
		
		sc.close();
	}
	

}
