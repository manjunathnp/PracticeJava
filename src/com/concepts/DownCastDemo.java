package com.concepts;

class Tande
{
	void m1()
	{
		System.out.println("Inside m1()");
	}
}

class Maga extends Tande
{
	void m2()
	{
		System.out.println("Inside m2()");
	}
	
}

public class DownCastDemo
{
	public static void main(String[] args) 
	{
		Tande t1 = new Maga(); //Upcasting
		t1.m1();
		
		Maga m1 = (Maga) t1;	//Downcasting
		t1.m1();
		
		
	}

}
