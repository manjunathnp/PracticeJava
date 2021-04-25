package com.javapractice;

public class Operations 
{
	static void addition()
	{
		int a=100, b=1000, res;
		res = a+b;
		System.out.println("Addition= "+res);
	}
	
	static void subtraction()
	{
		int a=100, b=25, res;
		res = a-b;
		System.out.println("Subtraction= "+res);
	}
	
	static void multiplication()
	{
		int a=6, b=10, res;
		res = a*b;
		System.out.println("Multiplication= "+res);
				
	}
	
	static void division()
	{
		int a=10, b=5, res;
		res = a/b;
		System.out.println("Division= "+res);
	}

	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		addition();
		subtraction();
		multiplication();
		division();
		System.out.println("Program Ends");
	}

}
