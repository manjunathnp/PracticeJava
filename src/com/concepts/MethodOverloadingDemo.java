/*
 *  Program to demo Method Overloading
 *  Developing methods with same name but with different signatures
 */

package com.concepts;

public class MethodOverloadingDemo 
{
	public void add(int a, int b)
	{
		int sum = a + b;
		System.out.println("Addition using int and int : "+ sum);
	}
	
	public void add(int a, double b)
	{
		double sum = a + b;
		System.out.println("Addition using int and double : "+ sum);
	}
	
	public void add(double a, double b)
	{
		double sum = a + b;
		System.out.println("Addition using double and double : "+ sum);
	}

	public static void main(String[] args) 
	{
		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		
		// Addition using int and int 
		obj.add(20, 30);
		
		// Addition using int and double
		obj.add(20, 32.5);

		// Addition using double and double
		obj.add(20.5, 22.4);
	}


}
