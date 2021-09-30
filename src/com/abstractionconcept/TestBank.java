package com.abstractionconcept;

public class TestBank 
{
	public static void main(String[] args) 
	{
		HDFCBank hdfc = new HDFCBank();
		
		hdfc.credit();
		hdfc.debit();
		hdfc.loan();
		
		Bank b = new HDFCBank();
		b.credit();
		b.debit();
		b.loan();
		
	}
}
