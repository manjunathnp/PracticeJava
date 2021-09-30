package com.oopsconcepts;

public class ChildClass extends BaseClass
{
	void m3()
	{
		System.out.println("ChildClass: Inside M3 Method");
	}
	
	//Method Overriding
	void m1()
	{
		System.out.println("ChildClass: Inside M1 Method(Overridden)");
	}
	
	void m4()
	{
		System.out.println("ChildClass: M4 Method");
	}
	
}
