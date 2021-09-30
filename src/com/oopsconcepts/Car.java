package com.oopsconcepts;

public class Car 
{
	int model;
	int wheel;
	
	public static void main(String[] args) 
	{
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model = 2012;
		a.wheel = 4;
		
		b.model = 2014;
		b.wheel = 4;
		
		c.model = 2016;
		c.wheel = 4;
		
		System.out.println("Before Assigning the References:");
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);
		
		System.out.println("After Re-Assigning the References:");
		
		a = b;
		b = c;
		c = a;
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		
		System.out.println(b.model);
		System.out.println(b.wheel);
		
		System.out.println(c.model);
		System.out.println(c.wheel);

	}

}
