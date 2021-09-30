package com.abstractionconcept;

public abstract class Bank 
{
	public abstract void loan(); //abstract method - with no method body
	
	public void credit() //Non-abstract Method
	{
		System.out.println("Bank: Inside Credit Method");
	}
	
	public void debit() //Non-abstract Method
	{
		System.out.println("Bank: Inside Debit Method");
	}
	
}
