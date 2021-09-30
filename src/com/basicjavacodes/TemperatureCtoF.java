package com.basicjavacodes;

import java.util.Scanner;

public class TemperatureCtoF 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature in Celcius: ");
		double cel = sc.nextDouble();
		
		//Login to convert Celsius to Fahrenheit 
		double fah = (cel * 1.8) + 32;
		
		System.out.println(cel+" Degree Celsius = "+fah+" Degree Fahrenheit");

	}

}
