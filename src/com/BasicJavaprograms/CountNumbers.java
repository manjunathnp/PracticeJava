package com.BasicJavaprograms;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		
		int count = 0;
		while(num > 0)
		{
			num = num/10;
			count++;
			
		}
		System.out.println("Count of the Numbers: "+count);
				

	}

}
