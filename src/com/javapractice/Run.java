package com.javapractice;

class A1
{
	void a1()
	{
		System.out.println("Inside A1 method");
	}
}

class B1 extends A1
{
	void b1()
	{
		System.out.println("Inside B1 method");
	}
}

class C1 extends A1
{
	int a; 
	int b;
	
	void m1()
	{
		this.a = 100;
		this.b = 200;
		System.out.println(a);
		System.out.println(b);
	}
}


public class Run {

	public static void main(String[] args) 
	{
		C1 c = new C1();
		c.m1();
		c.a1();
				
		

	}

}
