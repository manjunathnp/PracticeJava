package com.oopsconcepts;

public class Arrays 
{

	public static void main(String[] args)
	{
		int[] a = new int[4];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		
		String[] s = new String[3];
		s[0] = "Hello";
		s[2] = "Thanks!";
		s[1] = "Java";
		
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
		
		boolean[] b = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		char[] c = new char[3];
		c[0] = 'c';
		c[1] = '@';
		c[2] = '1';
		
		System.out.println(a.length);
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i]);
		}
			
	}

}
