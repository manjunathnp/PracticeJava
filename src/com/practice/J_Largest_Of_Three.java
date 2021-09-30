package com.practice;

import java.util.Scanner;

public class J_Largest_Of_Three 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num1: ");
		int n1 = sc.nextInt();
		System.out.println("Enter num2: ");
		int n2 = sc.nextInt();
		System.out.println("Enter num3: ");
		int n3 = sc.nextInt();
		
		int large = n1 > n2 ? n1:n2;
		int largest = n3 > large ? n3:large;
		
		System.out.println("Largest Number: "+largest);
		sc.close();
	}

}




















