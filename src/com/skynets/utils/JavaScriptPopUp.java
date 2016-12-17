package com.skynets.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class JavaScriptPopUp
{
	public static void acceptAlert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	public static void dismissAlert(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
	public static String getAlertText(WebDriver driver)
	{	
		Alert alt = driver.switchTo().alert();
		String altText = alt.getText();
		return altText;
	}
	public static void enterAlertText(WebDriver driver, String text)
	{
		Alert alt = driver.switchTo().alert();
		alt.sendKeys(text);
	}
}
