/*
 *  Method Overriding - Developing methods in sub-class with name and signature same as that of the methods in its super-class, but with different implementation
 */

package com.concepts;

class A
{
	void test()
	{
		System.out.println("Inside Class A test() method");
	}

	
}

class B extends A
{
	void test()
	{
		System.out.println("Inside Class B test() method");
	}
}


public class MethodOverridingDemo 
{

	public static void main(String[] args) 
	{
		
		A a = new A();
		a.test();
		
		B b = new B();
		b.test();
		
		
	}

}




