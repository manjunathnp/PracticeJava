package com.practice;

import java.util.Arrays;
import java.util.Collections;

public class V_Sort_Arrays 
{

	public static void main(String[] args) 
	{
		int[] a = {4, 6, 1, 0, -2};
		System.out.println("Before Sort: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("After Sort: "+Arrays.toString(a));
		
		Integer[] b = {9, 21, 02, 100};
		System.out.println("\nBefore Sort: "+Arrays.toString(b));
		Arrays.sort(b, Collections.reverseOrder());
		System.out.println("After Sort(Descending Order): "+Arrays.toString(b));
		
		int[] c = {2, 0, 1, 9, 33};
		System.out.println("\nBefore Sort: "+Arrays.toString(c));
		Arrays.parallelSort(c);
		System.out.println("After Sort: "+Arrays.toString(c));
	}

}
