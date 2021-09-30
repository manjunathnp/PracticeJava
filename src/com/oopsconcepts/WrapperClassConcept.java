package com.oopsconcepts;

public class WrapperClassConcept 
{
	public static void main(String[] args) 
	{
		String x = "100";
		System.out.println(x+20);
		
		//Data conversion from String to Integer
		int i = Integer.parseInt(x);//Integer is a Wrapper Class 
		System.out.println(i+20);
		
		//Data conversion from String to Double
		String y = "25.2";
		double d = Double.parseDouble(y);
		System.out.println(d);
		
		//Data conversion from String to Boolean
		String res = "true";
		Boolean b = Boolean.parseBoolean(res);
		System.out.println(b);
		
		//Data conversion from int to String
		int k = 500;
		
		String str = String.valueOf(k);
		System.out.println(str+20);
		
		//Number format exception
//		String u = "100$";
//		System.out.println(Integer.parseInt(u));
		 
		
		
	}

}
