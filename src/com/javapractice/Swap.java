package com.javapractice;

import java.util.Scanner;

public class Swap
{
	static void swapper(int num1, int num2)
	{
		System.out.println("Before Swap\nNum_1: "+num1+"\nNum_2: "+num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("\n");
		System.out.println("After Swap\nNum_1: "+num1+"\nNum_2: "+num2);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the NUM_1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the NUM_2: ");
		int num2 = sc.nextInt();
		
		swapper(num1, num2);
	}
	
}