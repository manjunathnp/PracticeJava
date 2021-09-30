package com.javalistconcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept 
{

	public static void main(String[] args)
	{
		//HashMap is a class that implements Map interface
		//extends AbstractMap
		//HashMap contains only UNIQUE elements
		//It stores the values in the form of Key, Value pair
		//Allows one Null Key and multiple Null Values
		//It is non-indexed
		//It is non-synchronized - not thread safe
		//Concurrent Modification Exception - Fail-Fast condition  
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		
		//add Key, Value pairs
		hmap.put(1, "Selenium");
		hmap.put(2, "QTP");
		hmap.put(3, "TestComplete");
		hmap.put(4, "RFT");
		
		//get Value based on Key
		System.out.println(hmap.get(2));
		System.out.println(hmap.get(5));
 
		//Iterate using for loop
		for(Entry m : hmap.entrySet())
		{
			System.out.println(m.getKey() +" "+ m.getValue());
		}
		
		System.out.println("Before Removal: "+hmap);
		hmap.remove(3);
		System.out.println(hmap);
		System.out.println("After Removal: "+hmap);
		
		//For Class objects
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("Tom", 26, "QA");
		Employee e2 = new Employee("Peter", 25, "Dev");
		Employee e3 = new Employee("Ron", 24, "Admin");
		
		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);

		//Traverse HashMap using for loop
		for(Entry<Integer, Employee> m: emp.entrySet())
		{
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee "+ key + " -> Info");
			
			System.out.println(e.name +" "+ e.age+" "+ e.dept);
		}


		
		
		
		
		
		
		
		
		
		
	}

}
