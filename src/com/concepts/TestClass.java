package com.concepts;

abstract class Section1
{
	abstract public void m1();
	void test1()
	{
		System.out.println("Inside test1() method");
	}
}

class Section2
{
	void test2()
	{
		System.out.println("Inside test2() method");
	}
	
	void m1()
	{
		System.out.println("Inside m1() method");
	}
}

public class TestClass 
{
	public static void main(String[] args) {
		Section2 sc2 = new Section2();
		
		sc2.test2();
		sc2.m1();
		
	}
	
	
	
}
