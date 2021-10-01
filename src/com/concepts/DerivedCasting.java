package com.concepts;

class Super1
{
	int a = 100;
	void m1()
	{
		System.out.println("Inside m1()");
	}
}

class Sub1 extends Super1
{
	int b = 200;
	void m2()
	{
		System.out.println("Inside m2()");
	}
}

public class DerivedCasting 
{
	public static void main(String[] args) 
	{	
		Super1 sup1 = new Super1();
		Sub1 sub1 = new Sub1();
				
		Super1 s1 = new Sub1();
		s1.m1();
		System.out.println(s1.a);
		
		sub1.m1();
		sub1.m2();
		System.out.println(sub1.a);
		System.out.println(sub1.b);
		
		
	}

}
