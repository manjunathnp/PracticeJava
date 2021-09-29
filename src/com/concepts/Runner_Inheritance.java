package com.concepts;

class SuperClass
{
	int a = 10;
	void m1()
	{
		System.out.println("Inside m1() of SuperClass");
	}
}

class SubClass extends SuperClass
{
	int b = 20;
	void m1()
	{
		super.m1();
		super.a=20;
		System.out.println("Inside m1() of SubClass");
	}
	
}


public class Runner_Inheritance 
{

	public static void main(String[] args) 
	{
		SubClass obj = new SubClass();
		
		obj.m1();
		System.out.println(obj.a);
		
	}

}



















