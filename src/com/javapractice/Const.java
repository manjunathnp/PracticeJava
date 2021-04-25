package com.javapractice;

public class Const 
{
	
	Const()
	{
		System.out.println("No Arguments");
	}
	
	Const(int a)
	{
		System.out.println("Single Arguments");
	}
	
	Const(int a, int b)
	{
		System.out.println("Two Arguments");
	}
			
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		
		Const c1 = new Const();
		Const c2 = new Const(1);
		Const c3 = new Const(1, 2);
		
			
		System.out.println("Program Ends");
	

	}

}
