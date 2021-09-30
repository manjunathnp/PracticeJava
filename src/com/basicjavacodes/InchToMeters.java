package com.basicjavacodes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InchToMeters 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length in Inches:");
		double inch = sc.nextDouble();
		
		//Login to convert Inch to Meters
		double meters = inch * 0.0254;
		
		DecimalFormat df = new DecimalFormat("#0.00");
		
		System.out.println(inch+" is equal to "+df.format(meters)+" Meters");
				
	}

}
