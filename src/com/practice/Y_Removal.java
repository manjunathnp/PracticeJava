package com.practice;

public class Y_Removal 
{
	public static void main(String[] args) 
	{
		String str1 = "$!@#$Hello#@@#World@#$";
		String str2 = "This is   a string with     white no spaces";
		
		System.out.println(str1.replaceAll("[^a-zA-Z0-9]", ""));
		System.out.println(str2.replaceAll("\\s", ""));

	}

}
