package com.practice;

import java.util.Random;

public class P_Generate_Random_Num 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		System.out.println("Random number within in 10 -> "+rand.nextInt(10));
		System.out.println("Random Boolean -> "+rand.nextBoolean());
		System.out.println("Random Double -> "+rand.nextDouble());
		System.out.println("Random number using Math -> "+Math.random());

	}

}
