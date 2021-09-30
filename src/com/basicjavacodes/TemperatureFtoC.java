package com.basicjavacodes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TemperatureFtoC 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature in Fahrenheit: ");
		double fah = sc.nextDouble();
		
		//Logic to convert Fahrenheit to Celsius
		double cel = (fah - 32)/1.8;
		
		DecimalFormat df= new DecimalFormat("#0.00");
		
		System.out.println(fah+" Degree Fahrenheit = "+df.format(cel)+" Degree Celsius");
	}

}
