package com.concepts;

public class Constructor 
{
	int a=100;
	int b=200;
	int c=300;
	
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
	
	Constructor(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		
		diplay();
		System.out.println(a + " | " +b+ " | " +c );
	}

	public void diplay()
	{
		System.out.println(a + " | " +b+ " | " +c );
	}
	
	public static void main(String[] args) 
	{
		Constructor c = new Constructor(10, 20, 30);
	}

}
