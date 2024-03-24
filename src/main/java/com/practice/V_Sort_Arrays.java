package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class V_Sort_Arrays 
{
	public static void main(String[] args)
	{
		int[] a = {2, 9, 0, 1};
		
		System.out.println("Before Sorting: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After Sorting: "+Arrays.toString(a));
		
		int[] b = {9, 8, 7, 6, 5};
		List<Integer> listB = new ArrayList<>(b.length);
		for(int i: b)
		{
			listB.add(i);
		}
		System.out.println("Before Sorting: "+listB);
		Collections.reverse(listB);
		System.out.println("After Sorting: "+listB);
		
		int[] c = {2, -2, 0, 9, -10};
		System.out.println("Before Sorting: "+Arrays.toString(c));
		Arrays.parallelSort(c);
		System.out.println("After Sorting: "+Arrays.toString(c));
		
		String[] str = {"Jan", "Feb", "Mar", "apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "dec"};
		Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);
		for(String s: str)
			System.out.print(s+" ");
		
		//Test

		
	}
	
	

}
