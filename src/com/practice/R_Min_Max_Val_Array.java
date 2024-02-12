package com.practice;

import java.util.Scanner;

public class R_Min_Max_Val_Array 
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
		
		int max = a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i] > max)
				max = a[i];
		}
		System.out.println("Maximum Value : "+max);
		
		int min = a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i] < min)
				min = a[i];
		}
		System.out.println("Minimum Value : "+min);
		
		sc.close();
	}

}
