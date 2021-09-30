package com.practice;

import java.util.Scanner;

import java.util.Scanner;

public class N_Sum_Elements_Array 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the size of the array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] a = new int[size]; 
		System.out.println("Enter the array elements: ");
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Entered array elements: ");
		for(int i=0; i<size; i++)
		{
			System.out.println(a[i]);
		}
		
		int sum = 0;
		for(int i=0; i<size; i++)
		{
			sum = sum+a[i];
		}
		System.out.println("Sum of array elements: "+sum);
		
		sc.close();
	}

}
