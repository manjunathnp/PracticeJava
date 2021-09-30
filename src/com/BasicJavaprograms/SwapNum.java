package com.BasicJavaprograms;
import java.util.Scanner;

public class SwapNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the 2nd number:");
		int num2 = sc.nextInt();
		
		System.out.println("Before Swap: \n"+ "num1 = "+num1+"\nnum2 = "+num2);
		
		/*
		//Logic_1 - using temp
		int temp = num1;
		num1 = num2;
		num2 = temp;
		*/
		
		/*
		//Logic_2 - using + and -
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		*/
		
		/*
		// Logic_3 - using * and /
		num1 = num1 * num2;
		num2 = num1 / num2;
		num1 = num1 / num2;
		*/
		
		/*
		// Logic_4 - using XOR
		num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		*/
		
		// Logic_5 - using single statement
		num2 = num1+num2 - (num1=num2);
		
		System.out.println("\nAfter Swap: \n"+ "num1 = "+num1+"\nnum2 = "+num2);
		
	}

}
