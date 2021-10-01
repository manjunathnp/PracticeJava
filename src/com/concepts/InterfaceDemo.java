package com.concepts;

// Multiple Inheritance achieved by Interfaces

interface Interface1
{
	void a1();
	void a2();
	void a3();
}

interface Interface2
{
	void a4();
	void a5();
	void a6();
}

class Class1 implements Interface1, Interface2
{
	public void a1()
	{
		System.out.println("Inside a1()");
	}
	
	public void a2()
	{
		System.out.println("Inside a2()");
	}
	
	public void a3()
	{
		System.out.println("Inside a3()");
	}
	
	public void a4()
	{
		System.out.println("Inside a4()");
	}
	
	public void a5()
	{
		System.out.println("Inside a5()");
	}
	
	public void a6()
	{
		System.out.println("Inside a6()");
	}
	
}


public class InterfaceDemo
{
	public static void main(String[] args)
	{
		Class1 c1 = new Class1();
		c1.a1();
		c1.a2();
		c1.a3();
		c1.a4();
		c1.a5();
		c1.a6();
	}

}
