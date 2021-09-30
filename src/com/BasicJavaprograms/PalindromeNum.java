package com.BasicJavaprograms;
import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		
		int n = num;
		
		int rev = 0;
		while(n != 0)
		{
			rev = rev*10 + n%10;
			n /= 10;
		}
		
		System.out.println("Reversed Number: "+rev);
		
		if(num == rev)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is NOT Palindrome");
		}
			

	}

}
