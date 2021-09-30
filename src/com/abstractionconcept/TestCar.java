package com.abstractionconcept;

public class TestCar 
{
	public static void main(String[] args) 
	{
		BMW bmw = new BMW();
		bmw.start();
		bmw.refuel();
		bmw.stop();
		bmw.theftSafety();
		
		Car c = new BMW();
		c.start();
		c.refuel();
		c.stop();
		
	}
}
