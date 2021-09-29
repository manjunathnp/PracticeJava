package com.concepts;

class A1
{
	A1(int a)
	{
		System.out.println("Inside A1()");
	}
}

class B1 extends A1
{
	B1(int a, int b)
	{
		super(5);
		System.out.println("Inside B1()");
	}
}

class C1 extends B1
{
	C1(double a)
	{
		super(2, 2);
		System.out.println("Inside C1()");
	}
}


public class Runner_Inheritance_2 
{
	public static void main(String[] args) 
	{
		C1 c = new C1(10.2);
		
	}
	

}






















