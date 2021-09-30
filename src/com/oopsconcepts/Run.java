package com.oopsconcepts;

class A
{
	int i=100;
	double d = 23.4;
	
	public void m1()
	{
		System.out.println("Inside m1() of class A");
	}
}

class B extends A
{
	int j = 2;
}

public class Run 
{
	public static void main(String[] args)
	{
		A a = new B(); //Upcasting
		
		A a1 = (A) new B();
		
		B b = new B();
		A a2 = b;
		
		B b2 = (B) a2;
		
		
		
		
	}
	
	
	

}
