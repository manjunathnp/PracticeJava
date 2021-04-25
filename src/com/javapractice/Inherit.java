package com.javapractice;

class Base
{
	int i = 100;
	void m1()
	{
		System.out.println("Parent's m1");
	}
}

class Derived extends Base
{
	int j = 100;
	void m2()
	{
		System.out.println("Child's m2");
	}
	
}

public class Inherit 
{
	
	public static void main(String[] args) 
	{
		Base b = new Base();
		System.out.println(b.i);
		b.m1();
		
		Derived d = new Derived();
		System.out.println(d.i);
		System.out.println(d.j);
		d.m1();
		d.m2();
		
		

	}

}
