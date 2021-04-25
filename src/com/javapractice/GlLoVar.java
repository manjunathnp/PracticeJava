package com.javapractice;

public class GlLoVar 
{
	//Global Variables
	int a;
	
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		
		//Local Variables
		int b = 200;
		System.out.println("Local Variable: "+b);
		
		GlLoVar gl = new GlLoVar();
		System.out.println("Global Variable: "+gl.a);
		
		System.out.println("Program Ends");
	}

}
