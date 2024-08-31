package com.neotech.lesson01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class TitleAndLogoValidation extends CommonMethods {

	@BeforeMethod
	public void openAndNavigate()
	{
	
		setUp();
	} 
	
	@AfterMethod
	
	public void quitBrowser()
	
	
	{
		tearDown();
		
		
	}
	
	
	@Test
	public void titleValidation()

	{
		
		String expectedTitle = "OrangeHRM";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
			
		{
			System.out.println("test passes");

		}
		
	else {
		
		System.out.println("title validation failed");
		  }
	
	}
	
	
	@Test
	public void logoValidation()

	{

		WebElement logo = driver.findElement(By.xpath("//div[@class='orangehrm-logo']/img"));
		if(logo.isDisplayed())
			
		{
			
			System.out.println("logo validaiton passed");
		}
		else 
		{
			
			System.out.println("logo validaiton failed");
		}
	}

	@Test
	public void loginValidation() throws Exception

	{
		sendText(driver.findElement(By.id("txtUsername")), ConfigsReader.getProperty("username"));
		sendText(driver.findElement(By.id("txtPassword")), ConfigsReader.getProperty("password"));
		click(driver.findElement(By.xpath("//button")));
		
		WebElement logo = driver.findElement(By.xpath("//a[@id='user-dropdown']"));
		if(logo.isDisplayed())
			
		{
			
			System.out.println("login is successfulll");
		}
		else 
		{
			
			System.out.println("login is Unsuccessfulll");
			throw new Exception(); //this will help you capture any specific exception or so if you want to specify it 
		}
		
				
		
	}

}
