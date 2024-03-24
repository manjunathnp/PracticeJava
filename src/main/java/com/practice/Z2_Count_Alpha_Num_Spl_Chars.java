package com.practice;

import java.util.Scanner;

public class Z2_Count_Alpha_Num_Spl_Chars 
{

	public static void main(String[] args) 
	{
		String str;
		int alph, digi, spl, spaces;
		alph = digi = spl = spaces = 0;
		int ascii;
		char ch;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		str = sc.nextLine();
		
		for(int i=0; i<str.length(); i++)
		{
			ascii = str.codePointAt(i);
			ch = str.charAt(i);
			
			if(ch >= '0' && ch <= '9')
				digi++;
			
			else if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch<= 'Z')
				alph++;
			
			else if(ascii == 32)
				spaces++;
			else
				spl++;
		}
		System.out.println("Alphabets: "+alph);
		System.out.println("Numbers: "+digi);
		System.out.println("Spaces: "+spaces);
		System.out.println("Spl Chars: "+spl);
		
		sc.close();
	}
}
