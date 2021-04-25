/*
 * To access static members from main() - Directly access using class name
 * To access non-static members from main() - Using reference variable
 * Inside Static blocks - only static members can be accessed 
 * Inside Non-static blocks - both static and non-static members can be accessed
 */

package com.concepts;

public class Demo 
{
	
	int a = 100;
	static int b = 200;
	static int c;
	int d;
	
	static void m1()
	{
		System.out.println("Inside Static Method m1()");
		System.out.println(b);
	}
	
	void m2()
	{
		System.out.println("Inside Non-Static Method m2()");
	}
	// Static block
	static
	{
		c = 300;
		System.out.println("Inside static block");
		
	}
	// Non-Static block
	{
		d = 400;
		System.out.println("Inside non-static block");

	
	}
	
	public void nonstaticblock()
	{
		System.out.println("Inside nonstaticblock()");
		System.out.println("Non Static member: "+ b);
	}
	
	public static void staticblock()
	{
		System.out.println("Inside staticblock()");
		System.out.println("Static member: "+c);
	}
	public static void main(String[] args) 
	{
		Demo demo = new Demo();
		System.out.println("Accessing Static Members:");
		System.out.println(Demo.b);
		Demo.m1();
		System.out.println(Demo.c);
		
		System.out.println("Accessing Non-Static Members:");
		System.out.println(demo.a);
		demo.m2();
		System.out.println(demo.d);
		
		demo.nonstaticblock();
		Demo.staticblock();
		
		
				
	
	}

}
