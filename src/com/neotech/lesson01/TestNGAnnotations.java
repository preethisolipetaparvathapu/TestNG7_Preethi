package com.neotech.lesson01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@Test
	public void test1()

	{
		System.out.println("this is test 1");
	}

	
	
	@Test
	public void test2()

	{
		System.out.println("this is test 2");
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
	
	//the tests that need the same before and after methods will be put in a single class so the same before and after methodss will be run for each of these test cases . so we group simillar tests together //but if 
//there is test which needs diff before and after methods then you will put that in diff class with diff before and after methods


}
