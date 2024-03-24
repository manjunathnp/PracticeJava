package com.practice;

import java.util.Random;

public class Q_Random_String 
{
	public static void main(String[] args) 
	{
		/*String numbers = "0123456789";
		String alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String splChars = "!@#$%^&*()_+-";
		String alphaNumSplChars = numbers + alphabets + splChars;*/
		String alphaNumSplChars = "[0-9a-zA-Z!@#$%^&*()_+-]";


		StringBuilder sbl = new StringBuilder();
		
		Random rand = new Random();
		
		int randStrLen = 10;
		
		for(int i=0; i<randStrLen; i++)
		{
			int index = rand.nextInt(alphaNumSplChars.length());
			char ch = alphaNumSplChars.charAt(index);
			sbl.append(ch);
			
		}
		
		String randomString = sbl.toString();
		System.out.println("Random String:\n"+ randomString);
		
	}

}
