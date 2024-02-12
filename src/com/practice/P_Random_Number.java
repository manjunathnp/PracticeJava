package com.practice;

import java.util.Random;

public class P_Random_Number 
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		
		// Random Integer within Range 1-100
		System.out.println(rand.nextInt(100));
		
		// Random Double
		System.out.println(rand.nextDouble());
		
		// Random Float
		System.out.println(rand.nextFloat());
		
		// Random Boolean
		System.out.println(rand.nextBoolean());
		
		// Random Long
		System.out.println(rand.nextLong());
		
		// Generate Random number using Math Class
		System.out.println(Math.random());
		
	}

}
