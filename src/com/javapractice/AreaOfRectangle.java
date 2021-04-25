package com.javapractice;

public class AreaOfRectangle
{
	static float areaOfRectangle(float width, float length)
	{
		
		float areaRectangle = width * length;
		return areaRectangle;
		
	}
	public static void main(String[] args) 
	{
		float area = areaOfRectangle(10, 20);
		System.out.println("Area of Rectangle: "+area);
		
	}

}
