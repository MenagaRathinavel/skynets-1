package com.skynets.config;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.skynets.utils.GetData;

public class DriverFactory
{
	public static WebDriver getDriverInstance()
	{
		WebDriver driver = null;
		String browserName = GetData.fromProperties("cdata", "browser");
		String appURL = GetData.fromProperties("cdata", "URL");
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.marionette", 
					"./driver_exe/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					"./driver_exe/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
		{
			System.out.println("Provide proper browser name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(appURL);
		return driver;
	}
}
