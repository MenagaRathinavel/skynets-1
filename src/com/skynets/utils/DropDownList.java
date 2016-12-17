package com.skynets.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownList
{
	public static void selectDDLByIndex(WebElement element, int index)
	{
		Select sct = new Select(element);
		sct.selectByIndex(index);
	}
	public static void selectDDLByVisiableText(WebElement element, String vText)
	{
		Select sct = new Select(element);
		sct.selectByVisibleText(vText);
	}
	public static void selectDDLByValue(WebElement element, String value)
	{
		Select sct = new Select(element);
		sct.selectByValue(value);
	}
	public static void deSelectDDLByIndex(WebElement element, int index)
	{
		Select sct = new Select(element);
		sct.deselectByIndex(index);
	}
	public static void deSelectDDLByValue(WebElement element, String value)
	{
		Select sct = new Select(element);
		sct.deselectByValue(value);
	}
	public static void deSlectDDLByVisiableText(WebElement element, String vText)
	{
		Select sct = new Select(element);
		sct.deselectByVisibleText(vText);
	}
	public static void deSelectAll(WebElement element)
	{
		Select sct = new Select(element);
		sct.deselectAll();
	}
	public static boolean verifyIsMultiple(WebElement element)
	{
		Select sct = new Select(element);
		boolean status =sct.isMultiple();
		return status;
	}
}
