package com.javapractice;

public class B 
{
	int a;
	int b;
	
	B(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		B obj = new B(10, 20);
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		System.out.println("Program Ends");
	}

}
