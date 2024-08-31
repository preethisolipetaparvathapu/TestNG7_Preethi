package com.neotech.lesson01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGMoreAnnotations {


	@AfterTest
	
	public void afterTest()
	{
		System.out.println("this is after test");
		
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("this is before test");
		
	}
	
	@Test
	
	public void testOne()
	
	{
		
		System.out.println("this is test case one");
		
	}
	
	@BeforeClass
	public void beforeClass()
	{
		
		System.out.println("this is before class");
	}

	@AfterClass
	public void afterClass()
	{
		
		System.out.println("this is after class");
	}
	
	
@BeforeMethod
	
	public void beforeMethod()
	{
		
		System.out.println("this method runs before the test methods ");
	}
	
@AfterMethod
	
	public void afterMethod()
	{
		
		System.out.println("this method runs after  the test methods ");
	}
	
}
