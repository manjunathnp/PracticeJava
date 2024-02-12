package com.practice;

import java.util.Scanner;

public class L_Count_Even_Odd_Digits 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		
		int e_count = 0;
		int o_count = 0;
		
		while(num != 0)
		{
			if(num%2 == 0)
			{
				e_count++;
			}
			else
			{
				o_count++;
			}
			num = num/10;
		}
		
		System.out.println("Even Count: "+e_count);
		System.out.println("Odd Count: "+o_count);
		
		sc.close();
	}
	

}
