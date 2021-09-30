package com.oopsconcepts;

public class Methods
{

	public static void main(String[] args)
	{
		Methods m1 = new Methods();
		
		m1.display();
		
		int addRes = m1.addition();
		System.out.println(addRes);
		
		int divRes = m1.div(50, 10);
		System.out.println(divRes);

	}

	//No Input - No Output
	public void display()
	{
		System.out.println("Method to Display!");
	}
	
	//No Input - Some Output
	public int addition()
	{
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	//Some Input - Some Output
	public int div(int x, int y)
	{
		int div = x/y;
		return div;
	}
}
