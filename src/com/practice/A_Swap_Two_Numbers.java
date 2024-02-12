package com.practice;

import java.util.Scanner;

public class A_Swap_Two_Numbers 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num_1: ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter the num_2: ");
		int n2 = sc.nextInt();
		
		System.out.println("Before Swap: "+n1+" "+n2);
		/*
		// Using 'temp' variable
		int temp = n1;
		n1 = n2; 
		n2 = temp;
		*/
		
		/*
		// Using + and - Operators
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		*/
		
		// Using * and / Operators
		n1 = n1 * n2;
		n2 = n1 / n2;
		n1 = n1 / n2;
		
		System.out.println("After Swap: "+n1+" "+n2);
		
		sc.close();
		
	}

}
