package com.practice;

public class Y_Word_Count
{
	public static void main(String[] args)
	{
		String str = "Hello world!";
		
		/*
		String[] words = str.split("\\s");
		System.out.println("Total Words: "+words.length);
		*/
		
		int count = 1;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ' && i<str.length())
			{
				count++;
			}
			
		}
		System.out.println("Total Words: "+count);
		
	}

}
