package com.oopsconcepts;

public class TestBase 
{

	public static void main(String[] args)
	{
		System.out.println("Main method - 1");
		main(10);
		main("String test");
	}

	public static void main(int a)
	{
		System.out.println("Main method - 2");
	}
	
	public static void main(String args)
	{
		System.out.println("Main method - 3");
	}

}
