package com.concepts;

interface One
{
	abstract void methodOne();
}

interface Two
{
	abstract void methodTwo();
}

class Sub implements One, Two
{
	public void methodOne() 
	{
		System.out.println("methodOne Implemented");
	}

	public void methodTwo() 
	{
		System.out.println("methodTwo Implemented");
	}

	
	
}

public class MultipleInheritanceDemo 
{

	public static void main(String[] args) 
	{
		Sub obj = new Sub();
		
		obj.methodOne();
		obj.methodTwo();
	}

}































