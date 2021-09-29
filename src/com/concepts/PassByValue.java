package com.concepts;

public class PassByValue 
{
	public static void main(String[] args) 
	{
		int a = 100, b = 200;
		System.out.println("Before Swap - Outside Method:\n"+a +" || "+b);
		swap(a, b);
		System.out.println("After Swap - Outside Method:\n"+a +" || "+b);
				
	}
	
	static void swap(int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swap - Inside Method:\n"+a +" || "+b);
	}

}














































