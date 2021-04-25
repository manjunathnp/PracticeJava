package com.concepts;

public class Constructor 
{
	int a = 100;
	
	Constructor()
	{
		this(10);
		System.out.println("Inside Default Constructor");
	}
	
	Constructor(int num)
	{
		this(10, 20);
		System.out.println("Inside Parameterized int Constructor");
	}
	
	Constructor(int n1, int n2)
	{
		this(21.2, 22.0);
		System.out.println("Inside Parameterized int, int Constructor");
	}
	
	Constructor(double n1, double n2)
	{
		System.out.println("Inside Parameterized double, double Constructor");
	}
	

	public static void main(String[] args) 
	{
		Constructor c = new Constructor();
	}

}
