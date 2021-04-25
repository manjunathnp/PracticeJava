package com.javapractice;

public class Demo 
{
	static int add(int a, int b)
	{
		int res = a+b;
		return res;
	}
	
	static int sub(int a, int b)
	{
		int res = a-b;
		return res;
	}
	
	static int mult(int a, int b)
	{
		int res = a*b;
		return res;
	}
	
	static int div(int a, int b)
	{
		int res = b/a;
		return res;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Program Starts\n");
		int addres = add(1, 10);
		System.out.println(addres);
		
		int subres = sub(10, 5);
		System.out.println(subres);
		
		int multres = mult(5, 10);
		System.out.println(multres);
		
		int divres = div(5, 10);
		System.out.println(divres);
		
		System.out.println("\nProgram Ends");
		
	}

}
