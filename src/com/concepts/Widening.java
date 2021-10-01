package com.concepts;

public class Widening 
{
	public static void main(String[] args) 
	{
		int a = 100;
		double b = a;
		System.out.println(a);
		System.out.println(b); // Auto-Widening
		
		double x = 200;
		int y = (int) x; // Explicit-Narrowing
		System.out.println(x);
		System.out.println(y);
	}

}
