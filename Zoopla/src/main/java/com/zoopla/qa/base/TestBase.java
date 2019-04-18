package com.zoopla.qa.base;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.zoopla.qa.util.TestUtil;

public class TestBase {
	public static Properties prop;
	public static WebDriver driver;
	
	
	public TestBase()
	{
		try {
			
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Automation\\Zoopla\\src\\main\\java\\com\\zoopla\\qa\\config\\config.properties");
			prop.load(ip);
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void intialization()
	{
		
		String browserName=prop.getProperty("broswer");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","chromdriverpath");
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","firfoxdriverpath");
			driver=new FirefoxDriver();
		} 

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LAOD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get("url");
	}

	
	

}
