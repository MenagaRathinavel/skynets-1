package com.skynets.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getHeaderElement()
	{
		WebElement element = driver.findElement(By.id("headerContainer"));
		return element;
	}
	public WebElement getUsernameTextbox()
	{
		// Handling exceptions in Page Object Model
		WebElement element = null;
		try
		{
			element = driver.findElement(By.name("username"));
		}
		catch(Exception e)
		{
			element = driver.findElement(By.name("Un"));
		}
		return element;
	}
	public WebElement getPasswordTextbox()
	{
		return driver.findElement(By.name("pwd"));
	}
	public WebElement getKeepMeLoggedInCheckbox()
	{
		return driver.findElement(By.id("keepLoggedInCheckBox"));
	}
	public WebElement getLoginButton() 
	{
		return driver.findElement(By.id("loginButton"));
	}
	public WebElement getErrorMsg()
	{
		return driver.findElement(By.xpath("(//span[@class='errormsg'])[1]"));
	}
}
