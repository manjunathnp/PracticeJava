package com.javalistconcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept
{

	public static void main(String[] args)
	{
		//Dynamic Array  -- ArrayList
		//1. Allows duplicate values
		//2. Maintains indexed values
		//3. Synchronized 
		//4. Allows random access to fetch any element - as it stores the values based on index
		
		ArrayList al = new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al.size());
		
		al.add(40);
		al.add(50);
		al.add(50);
		
		//Size of Array
		System.out.println(al.size());
		
		//To fetch value from any index
		System.out.println(al.get(4));
		
		//To print all the values from ArrayList: use for loop or iterator
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
		//Non-Generic VS Generic
		ArrayList<Integer> intal = new ArrayList<Integer>();
		intal.add(100);
		
		ArrayList<String> stral = new ArrayList<String>();
		stral.add("This is Generics");
		stral.add("Selenium");
		
		//Initializing the Employee class objects
		Employee emp1 = new Employee("Tom", 25, "QA");
		Employee emp2 = new Employee("Peter", 27, "NOC");
		Employee emp3 = new Employee("Jon", 29, "Dev");

		ArrayList<Employee> empal = new ArrayList<Employee>();
		
		empal.add(emp1);
		empal.add(emp2);
		empal.add(emp3);
		
		//Using Itertator to traverse the values
		Iterator<Employee> it = empal.iterator();
		
		while(it.hasNext())
		{
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}

		
		

		

		
		
		

		
	}

}
