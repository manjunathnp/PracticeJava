package com.practice;

import java.util.Scanner;

public class O_Array_Even_Odd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int e_count=0;
		int o_count=0;
		
		int[] a = new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Even Numbers: ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2 == 0)
			{
				e_count++;
				System.out.println(a[i]);
			}
					
		}
		System.out.println("Odd Numbers: ");
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2 != 0)
			{
				o_count++;
				System.out.println(a[i]);
			}
					
		}
		System.out.println("Even Count = "+e_count);
		System.out.println("Odd Count = "+o_count);
		
		sc.close();
	}

}
