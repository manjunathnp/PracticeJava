package com.practice;

import java.util.Scanner;

public class Z1_Count_Alpha_Num_Spl_Char 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		int alph, digi, spaces, spl, ascii;
		char ch;
		alph = digi = spaces = spl = 0;
		
		for(int i=0; i<str.length(); i++)
		{
			ascii = str.codePointAt(i);
			ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
			{
				alph++;
			}
			else if(ch >= '0' && ch <= '9')
			{
				digi++;
			}
			else if(ascii == 32)
			{
				spaces++;
			}
			else
			{
				spl++;
			}
			
		}
		System.out.println("Count of: ");
		System.out.println("Alphabets: "+alph);
		System.out.println("Numbers: "+digi);
		System.out.println("Spaces: "+spaces);
		System.out.println("Special Characters: "+spl);
		
		
		sc.close();

	}

}
