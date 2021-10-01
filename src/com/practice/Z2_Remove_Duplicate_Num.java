package com.practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class Z2_Remove_Duplicate_Num
{

	public static void main(String[] args) 
	{
		int[] arr = {10, 20, 20, 25, 30, 30, 35, 40, 50};
		
		Set<Integer> setObj = new LinkedHashSet<>(arr.length);
		
		for(int i: arr)
		{
			setObj.add(i);
		}
		
		System.out.println(setObj);
		
		
	}

}
