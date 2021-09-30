package com.oopsconcepts;

public class MainOverload 
{
	//This method is the entry point for JVM
	public static void main(String[] args) 
	{
		System.out.println("Inside main() method");
		MainOverload.main(3);
		MainOverload.main(2, 3);
		
	}
	
	public static void main(int a) 
	{
		System.out.println("Inside main() method - 2");
		
	}
	
	public static void main(int a, int b) 
	{
		System.out.println("Inside main() method - 3");
		
	}
	
	
}
