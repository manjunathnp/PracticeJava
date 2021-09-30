package com.practice;

import java.util.Random;

public class Q_Generate_Random_String
{

	public static void main(String[] args) 
	{
		String num = "0123456789";
		String alpha = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		//String splChar = "!@#$%^&*()_+";
		
		String alphNumeric = num+alpha;
		
		Random rand = new Random();
		StringBuilder sbl = new StringBuilder();
		
		for(int i=0; i<10;i++)
		{
			int index = rand.nextInt(alphNumeric.length());
			char ch = alphNumeric.charAt(index);
			
			sbl.append(ch);
					
		}
		System.out.println(sbl.toString());
		
	}

}
