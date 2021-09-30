package com.oopsconcepts;

public class MethodOverriding extends ChildClass
{

	public static void main(String[] args) 
	{
		MethodOverriding mo = new MethodOverriding();
		
		mo.m1();
		m2();
		mo.m3();
		
		//Dynamic Polymorphism - ChildClass object can be referred by Parent Class reference variable
		BaseClass b = new ChildClass();//Top-Casting
		b.m1();
		b.m2();
		
		//Static Polymorphism
		ChildClass c = new ChildClass();
		c.m1();
		c.m2();
		c.m1(1);
		
/*		//Down-Casting not possible - give ClassCastingException during Run-time
		ChildClass c1 = (ChildClass) new BaseClass();
		c1.m1();*/
	}

}
