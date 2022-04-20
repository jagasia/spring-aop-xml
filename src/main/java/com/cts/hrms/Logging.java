package com.cts.hrms;

public class Logging {
	public void beforeAdvice()
	{
		System.out.println("Before advice has started");
	}
	
	public void afterAdvice()
	{
		System.out.println("After advice has started");
	}
}
