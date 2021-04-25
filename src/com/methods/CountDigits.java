package com.methods;

import java.util.Scanner;

public class CountDigits {
	
	static void numberCounter(int num)
	{
		int number = num;
		int count = 0;
		while(num != 0)
		{
			num = num/10;
			count++;
		}
		
		System.out.println("Total number of digits in "+number+" = "+count);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		sc.close();
		
		numberCounter(num);
		

	}

}
