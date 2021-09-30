package com.javalistconcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept 
{

	public static void main(String[] args) 
	{
		//It is similar to HashMap - but it is Synchronized
		//Stores data in the form of Key, Value pair
		//Key -->(in the form of) Object --> HashCode(a unique object code or number) --> Value
		//Allow only UNIQUE values
		//Does not all null Key or/and null Values - gives null pointer exceptions
		
		Hashtable hshtble1 = new Hashtable();
		hshtble1.put(1, "Ron");
		hshtble1.put(2, "Tom");
		hshtble1.put(3, "Jon");
		
		//Create a clone/shallow copy of hshtble1
		Hashtable hshtbl1Clone = new Hashtable();
		hshtbl1Clone = (Hashtable)hshtble1.clone();
		
		System.out.println("Original: "+hshtble1);
		System.out.println("Clone: "+ hshtbl1Clone);

		hshtble1.clear();
		
		System.out.println("Original: "+hshtble1);
		System.out.println("Clone: "+ hshtbl1Clone);
		
		//contains value:
		
		Hashtable hshtble2 = new Hashtable();
		hshtble2.put("A1", "Java");
		hshtble2.put("B1", "Selenium");
		hshtble2.put("C1", "Jon");
		
		if(hshtble2.containsValue("Jon"))
		{
			System.out.println("Value present");
		}
		
		//Print all the values - using -Enumerations - elements()
		Enumeration e =  hshtble2.elements();
		System.out.println("Values from Hashtable2 using Enumeration:\n");
		
		while (e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		//Get all the values from Hashtable using entry set - set of hasttable values:
		System.out.println("Values from Hashtable2 using Entry Set:\n");

		Set s = hshtble2.entrySet();
		System.out.println(s);
		
		Hashtable hshtble3 = new Hashtable();
		hshtble3.put("A1", "Java");
		hshtble3.put("B1", "Selenium");
		hshtble3.put("C1", "Jon");
		
		//Compare both Hashtables are equal or not
		if(hshtble2.equals(hshtble3))
		{
			System.out.println("Both are EQUAL");
		}
		
		//Get the value from a Key:
		System.out.println(hshtble2.get("A1"));
		
		//Get the Hashcode of Hashtable object:
		System.out.println("Hashcode value of Hashtable3: "+hshtble3.hashCode());
		
		
		
	}

}
