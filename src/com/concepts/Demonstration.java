package com.concepts;

class Cluster
{
	int a;
	int b;
	
	Cluster(int a, int b)
	{
		this.a = a; //this.a => Global Variable
		this.b = b; //this.b => Global Variable
		System.out.println(this.a);
		System.out.println(this.b);
		
	}
	
}

public class Demonstration 
{
	public static void main(String[] args) {
		Cluster cl = new Cluster(2, 3);
		
		
	}
	
}
