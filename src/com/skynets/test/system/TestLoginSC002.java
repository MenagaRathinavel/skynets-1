package com.skynets.test.system;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.skynets.config.DriverFactory;
import com.skynets.ui.LoginPage;
import com.skynets.utils.GetData;

public class TestLoginSC002
{
	WebDriver driver = DriverFactory.getDriverInstance();
	LoginPage login = new LoginPage(driver);
	String un = GetData.fromExcel("tdata", "SC002", 1, 0);
	String pwd = GetData.fromExcel("tdata", "SC002", 1, 1);
	@Test
	public void testLoginTC005()
	{
		// Enter Invalid Credetails
		login.getUsernameTextbox().sendKeys(un);
		login.getPasswordTextbox().sendKeys(pwd);
		login.getLoginButton().click();
		// Verify Error Message
		String actual = login.getErrorMsg().getText();
		String expected = "Username or Password is invalid. Please try again.";
		Assert.assertEquals(actual, expected);
		// Verify It lands on Login Screen
		String actualText = login.getHeaderElement().getText();
		String expectedText = "Please identify yourself";
		Assert.assertEquals(actualText, expectedText);
	}
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
}
