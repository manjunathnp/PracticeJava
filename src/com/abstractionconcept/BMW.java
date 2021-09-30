package com.abstractionconcept;

public class BMW implements Car{

	@Override
	public void start() {
		System.out.println("BMW Start");
		
	}

	@Override
	public void refuel() {
		System.out.println("BMW refuel");
		
	}

	@Override
	public void stop() {
		System.out.println("BMW stop");
		
	}
	
	public void theftSafety()
	{
		System.out.println("BMW Theft Safety");
	}

	
}


