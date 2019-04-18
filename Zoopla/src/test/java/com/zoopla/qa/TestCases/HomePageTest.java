package com.zoopla.qa.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.zoopla.qa.base.TestBase;
import com.zoopla.qa.pages.HomePage;


public class HomePageTest extends TestBase {
	

	HomePage homepage;
	public HomePageTest()
	{
		super(); // this will call the super class because prop is avialable under the initilzayion() method
	}


	
	@BeforeMethod
	public void setUp()
	{
		intialization();// we can call the all inti ()
		
		homepage=new HomePage();//  created homepage objectb coz in test case we can call
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
