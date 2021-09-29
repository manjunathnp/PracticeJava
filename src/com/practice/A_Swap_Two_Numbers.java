package com.practice;

import java.util.Scanner;

public class A_Swap_Two_Numbers {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of num1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the value of num2: ");
		int num2 = sc.nextInt();
		
		System.out.println("Before Swap: "+"\n Num1 = "+num1+"\n Num2 = "+num2);
		
		/*// Logic-1
		int temp = num1;
		num1 = num2;
		num2 = temp;*/
		
		/*// Logic-2
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;*/
		
		//Logic-3
		num1 = num1 * num2;
		num2 = num1 / num2;
		num1 = num1 / num2;
		
		System.out.println("After Swap: "+"\n Num1 = "+num1+"\n Num2 = "+num2);	
		
		sc.close();
	}

}
