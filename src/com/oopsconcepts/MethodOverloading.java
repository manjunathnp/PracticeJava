package com.oopsconcepts;

public class MethodOverloading 
{

	public static void main(String[] args) 
	{
		MethodOverloading mo = new MethodOverloading();
		mo.sum();
		mo.sum(1);
		mo.sum(2, 3);
	}
	
	//Method Overloading - Methods with same name with differenct signatures within a same class
	public  void sum()
	{
		System.out.println("Sum: No Parameters");
	}

	public void sum(int a)
	{
		System.out.println("Sum: 1 Parameters");
	}
	
	public void sum(int a, int b)
	{
		System.out.println("Sum: 2 Parameters");
	}
}
