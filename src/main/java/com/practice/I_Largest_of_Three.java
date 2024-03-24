package com.practice;

import java.util.Scanner;

public class I_Largest_of_Three {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num_1:");
		int a = sc.nextInt();
		
		System.out.println("Enter the num_2: ");
		int b = sc.nextInt();
		
		System.out.println("Enter the num_3: ");
		int c = sc.nextInt();
		
		int large = a>b ? a : b;
		int largest = c>large ? c:large;
		
		System.out.println("Largest number is = "+largest);
		
		sc.close();
	}

}
