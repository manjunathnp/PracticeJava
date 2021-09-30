package com.practice;

import java.util.Scanner;

public class D_Reverse_String {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String Value: "); 
		String str = sc.nextLine();
		
		/*// Logic-1
		StringBuffer sb = new StringBuffer(String.valueOf(str));
		StringBuffer rev = sb.reverse();
		*/
		
		/*// Logic-2
		StringBuilder sbl = new StringBuilder(String.valueOf(str));
		StringBuilder rev = sbl.reverse();
		*/
		
		// Logic-3
		String rev = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}
		
		System.out.println("Reversed String: \n"+rev);
		sc.close();
	}

}
