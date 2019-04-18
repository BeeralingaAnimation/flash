package com.zoopla.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	//object repository usning Annonation @FinBY
	
	@FindBy(xpath="//input[@id='search-input-location']")
	WebElement searchBox;
	
	@FindBy(xpath="//button[@id='search-submit']")
	WebElement searchButton;
	
	
	//intilizating the above webElements usning constructor of pageFactory
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
