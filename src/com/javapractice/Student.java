package com.javapractice;

public class Student 
{
	int sid;
	String sname;
	int marks;
	static String college = "QSpiders";

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.sid = 1001;
		s1.sname = "Girish";
		s1.marks = 99;
		
		s2.sid = 1002;
		s2.sname = "Chandru";
		s2.marks = 97;
		
		System.out.println("Student ID: "+s1.sid);
		System.out.println("Student Name: "+s1.sname);
		System.out.println("Student Marks: "+s1.marks);
		System.out.println("Student College: "+Student.college);
		
		System.out.println("\n");
		
		System.out.println("Student ID: "+s2.sid);
		System.out.println("Student Name: "+s2.sname);
		System.out.println("Student Marks: "+s2.marks);
		System.out.println("Student College: "+Student.college);
		
	}

}
