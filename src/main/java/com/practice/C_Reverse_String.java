package com.practice;

import java.util.Scanner;

public class C_Reverse_String 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		
		/* 
		String rev = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("Reversed String: "+rev);
		*/
		
		/*
		StringBuilder sb = new StringBuilder(String.valueOf(str));
		System.out.println("Revesed String: "+sb.reverse());
		*/
		
		StringBuffer sbf = new StringBuffer(String.valueOf(str));
		System.out.println("Reversed String: "+sbf.reverse());
		
		sc.close();
	}

}
