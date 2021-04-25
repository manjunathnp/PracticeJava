package com.javapractice;

public class AreaOfTriangle 
{
	static float areaOfTriangle(float base, float height)
	{
		float areaTriangle = (base * height)/2;
		return areaTriangle;
	}
	
	public static void main(String[] args) 
	{
		float area = areaOfTriangle(10, 12);
		System.out.println("Area of Triangle: "+area);
	}

}
