package com.javapractice;

import java.util.HashSet;

public class A 
{
	
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		
		hs.add(1);
		hs.add(2);
		hs.add(3.2);
		hs.add(2);
		
		for(Object o:hs)
		{
			System.out.println(o);
		}
		
		
		
		
	}
	

}
