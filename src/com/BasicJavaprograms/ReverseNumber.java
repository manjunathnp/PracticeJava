package com.BasicJavaprograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		System.out.println("Before Reversal: "+num);
		
		/*
		//Using StringBuffer
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		*/
		
		/*
		//Using StringBuilder
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		*/
		
		int rev = 0;
		while (num != 0)
		{
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println("After Reversal: "+rev);

	}

}
