package com.oopsconcepts;

public class StaticNonStatic 
{
	//Global Variables
	String name = "John"; //Non Static Global Variable
	static int age = 20; //Static Global Variable
	
	public static void main(String[] args) 
	{
		//Call Static Method and Variables
		//1. Direct Calling
		sum();
		System.out.println(age);
		
		//2. Calling by Class name
		StaticNonStatic.sum();
		System.out.println(StaticNonStatic.age);
		
		//Call Non-Static Method and Variables
		//Create Object
		StaticNonStatic obj = new StaticNonStatic();
		obj.sendMail();
		System.out.println(obj.name);
		
		//Is it possible to access Static methods using Object Reference? == "YES"
		obj.sum(); //But gives Warning - "Static methods should be accessed the static way"
		
		
	}
	
	//Non-Static Method
	public void sendMail()
	{
		System.out.println("Inside sendMail Method");
	}
	
	//Static Method
	public static void sum()
	{
		System.out.println("Inside Sum Method");
	}

}
