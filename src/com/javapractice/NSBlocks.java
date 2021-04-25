package com.javapractice;

public class NSBlocks 
{
	{
		System.out.println("Inside non-static block1");
	}
	
	{
		System.out.println("Inside non-static block2");
	}
	
	static
	{
		System.out.println("Inside static block1");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		NSBlocks b1 = new NSBlocks();
		
		System.out.println("Program Ends");
	}

}
