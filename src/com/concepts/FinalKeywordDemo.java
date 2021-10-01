package com.concepts;

final class Part1
{
	void m1()
	{
		System.out.println("Inside m1() method");
	}
}

class Part2 
{
	final void m2()
	{
		System.out.println("Inside m2() final method");
	}
	
}

class Part3 extends Part2
{
	void m3()
	{
		System.out.println("Inside m3() method");
	}
	
	void m1()
	{
		System.out.println("Inside m1() of Part3");
	}
	
	final int a = 100;
}


public class FinalKeywordDemo 
{
	final static int b = 200;

	public static void main(String[] args) 
	{
		Part3 p3 = new Part3();
		p3.m2();
		
		System.out.println(b);
		
	}

}
