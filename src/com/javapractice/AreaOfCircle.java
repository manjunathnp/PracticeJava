package com.javapractice;

public class AreaOfCircle 
{
	static double PI = 3.142;
	
	static double areaOfCircle(double radius)
	{
		double areaCircle;
		areaCircle = PI * (radius*radius);
		return areaCircle;
	}
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		
		double areaCircle = areaOfCircle(5);
		System.out.println(areaCircle);
		
		System.out.println("Program Ends");
	}
}
