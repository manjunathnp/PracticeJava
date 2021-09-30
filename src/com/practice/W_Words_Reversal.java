package com.practice;

import java.util.Scanner;

public class W_Words_Reversal 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		String[] words = str.split("\\s");
		
		String revStr = "";
		for(String word: words)
		{
			/*
			String revWord = "";
			for(int i=word.length()-1; i>=0; i--)
			{
				revWord = revWord + word.charAt(i);
			}
			revStr = revStr + revWord + " ";
			*/
			
			StringBuilder sbl = new StringBuilder(word);
			sbl.reverse();
			revStr = revStr + sbl.toString() + " ";
		}

		System.out.println(revStr);
		sc.close();
		
	}

}
