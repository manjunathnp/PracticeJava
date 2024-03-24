package com.practice;

import java.util.Scanner;

public class N_Array_Sum 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] a = new int[size];
		
		System.out.println("Enter the array elements: ");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int sum = 0;
		System.out.println("Sum of array elements: ");
		for(int i=0; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		System.out.println(sum);
		
		sc.close();
	}

}
