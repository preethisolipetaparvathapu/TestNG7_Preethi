package com.neotech.lesson01;

import org.testng.annotations.Test;

public class TestNGDemo

{

	@Test

	public void testOne()

	{
		System.out.println("this is test one");
	}

	@Test

	public void testTwo()

	{
		System.out.println("this is test two");
	}
	
	
	@Test

	public void testThree()

	{
		System.out.println("this is test three");
	}
	
//testng excutes the test cases by default unsing the al[phabetical order in the method name here foir example or the test case name for example . so testTwo will run after TestThree
	// when you have main methods in java classes each main method is takena  as a test in TestNG each @Test annotation is ataken asn a test.
	//u nedd to give @Test annotation for every test separately  
	

}
