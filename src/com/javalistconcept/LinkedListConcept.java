package com.javalistconcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept 
{

	public static void main(String[] args) 
	{
		LinkedList<String> strllst = new LinkedList<String>();
		
		//Add
		strllst.add("Selenium");
		strllst.add("QTP");
		strllst.add("Test");
		strllst.add("RFT");
		
		//Print
		System.out.println("Contents of LinkedList: "+strllst);
		
		//Add first
		strllst.addFirst("Manjunath");
		strllst.addLast("Automation");
		System.out.println("Contents of LinkedList: "+strllst);
		
		//get
		System.out.println(strllst.get(0));
		System.out.println(strllst.get(3));
		
		//set
		strllst.set(0, "WebDriver");
		System.out.println(strllst.get(0));
		
		//remove first element and last element
		strllst.removeFirst();
		strllst.removeLast();
		System.out.println("Contents of LinkedList: "+strllst);
		
		//Removing specific element
		strllst.remove(2);
		System.out.println("Contents of LinkedList: "+strllst);
		
		//Print all the values of LinkedList
		//for loop
		//Advance for loop
		//Iterator
		
		//for loop
		System.out.println("***Using simple for loop***");
		for (int n=0; n<strllst.size(); n++)
		{
			System.out.println(strllst.get(n));
		}

		//Advanced for loop
		System.out.println("***Using advanced for loop***");
		for(String str: strllst)
		{
			System.out.println(str);
		}
		
		//Using Iterator
		System.out.println("***Using Iterator***");
		Iterator<String> it = strllst.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Using while loop
		System.out.println("***Using while loop***");

		int num = 0;
		while(strllst.size() > num)
		{
			System.out.println(strllst.get(num));
			num++;
		}
		
		
		

	}

}
