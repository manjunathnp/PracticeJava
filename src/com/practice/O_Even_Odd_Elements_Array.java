package com.practice;

import java.util.Scanner;

public class O_Even_Odd_Elements_Array
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int[] a = new int[size];
		
		System.out.println("Enter the array elements: ");
		for(int i=0; i<size; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int e_count = 0, o_count = 0;
		for(int i=0; i<size; i++)
		{
			if(a[i]%2 == 0)
			{
				e_count++;
			}
			else
			{
				o_count++;
			}
		}
		System.out.println("Even Number Count = "+e_count);
		System.out.println("Odd Number Count = "+o_count);
		
		
		
		
		sc.close();
	}

}
