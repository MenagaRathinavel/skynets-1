package com.skynets.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getTimeTrackTab()
	{
		return driver.findElement(By.xpath(
				"//div[contains(text(), 'Time-Track')]"));
	}
	public WebElement getTasksTab()
	{
		return driver.findElement(By.xpath("//div[text()='Tasks']"));
	}
	public WebElement getUsersTab()
	{
		return driver.findElement(By.xpath("//div[text()='Users']"));
	}
	public WebElement getSettingsTab()
	{
		return driver.findElement(By.xpath("//div[text()='Settings']"));
	}
	public  WebElement getLogoutLink()
	{
		return driver.findElement(By.id("logoutLink"));
	}
}
