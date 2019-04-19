package GridTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		
		//when every we want run code on different machine or VM , so we have create
		//the  object of DesiredCapabilies class 
		
		
		//1.//definig Desired capabilities 
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		
		
		//recentalt introduced  and create object of ChromeOptions Class
		
		//2.chrome Options defination
		ChromeOptions options=new ChromeOptions();
		options.merge(cap);  //merge options into cap 
		
		//http://192.168.2.10:4444/grid/ instad od grid written wd/hub
		String HubUrl=" http://192.168.2.10:4444/wd/hub";
		
		
		WebDriver driver=new RemoteWebDriver(new URL(HubUrl),options);
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		//driver.quit(); 
	}

}
