package com.skynets.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenTasksPage 
{
	WebDriver driver;
	public OpenTasksPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement getCreateNewTasksButton()
	{
		return driver.findElement(By.xpath("//input[@value='Create New Tasks']"));
	}
}
