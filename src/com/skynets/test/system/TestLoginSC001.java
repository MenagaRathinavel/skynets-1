package com.skynets.test.system;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.skynets.config.DriverFactory;
import com.skynets.ui.HomePage;
import com.skynets.ui.LoginPage;
import com.skynets.utils.GetData;

public class TestLoginSC001
{
	WebDriver driver = DriverFactory.getDriverInstance();
	LoginPage login = new LoginPage(driver);
	HomePage home = new HomePage(driver);
	String un = GetData.fromExcel("tdata", "SC001", 1, 0);
	String pwd = GetData.fromExcel("tdata", "SC001", 1, 1);
	
	@Test
	public void testLoginTC001()
	{
		// Enter Valid Credentials in login page
		login.getUsernameTextbox().sendKeys(un);
		login.getPasswordTextbox().sendKeys(pwd);
		login.getLoginButton().click();
		// Verify Home page and click logout link
		boolean actual = home.getLogoutLink().isDisplayed();
		boolean expected = true;
		Assert.assertEquals(actual, expected);
		home.getLogoutLink().click();
		// Verify Login page
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
