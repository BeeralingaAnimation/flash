package GridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FireFoxTest {

	public static void main(String[] args) throws MalformedURLException {

		
		//1.Defining the desired capabilities
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		System.out.println(cap.getPlatform());
		
		//2.Defining ChromeOption
		ChromeOptions option=new ChromeOptions();
		option.merge(cap);
		
		//3.HubUrl
		String HubUrl="http://192.168.2.10:4444/wd/hub";
		
		//3.Defining the remotewebdriver
		WebDriver driver=new RemoteWebDriver(new URL(HubUrl),option);
		
		driver.get("http://www.google.com");
		System.out.println(driver.getCurrentUrl());
	}

}
