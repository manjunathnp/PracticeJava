package com.concepts;

class Person
{
	String fname;
	String lname;
	
	Person(String fname, String lname)
	{
		this.fname = fname;
		this.lname = lname;
	}
	
	void displayPersonDetails()
	{
		System.out.println(fname);
		System.out.println(lname);
	}
}

class Student extends Person
{
	int sID;
	int sMarks;
	
	Student(String fname, String lname, int sID, int sMarks)
	{
		super(fname, lname);
		this.sID = sID;
		this.sMarks = sMarks;
	}
	
	void displayStudentDetails()
	{
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(sID);
		System.out.println(sMarks);
	}
}


public class Run2 
{

	public static void main(String[] args) 
	{
		Student stu1 = new Student("Alan", "Jones", 121, 90);
		stu1.displayStudentDetails();
		
		System.out.println();
		
		Student stu2 = new Student("Arnold", "Samuel", 122, 86);
		stu2.displayStudentDetails();
		
	}

}



























