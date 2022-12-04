package com.RegressionTestCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass;
import com.PageObjects.loginPage;
import com.Utilities.Log;

public class VerifyUserLoginTest extends BaseClass {
	
	
	
	@BeforeSuite
	public void beforesuit()
	{
		DOMConfigurator.configure("log4j.xml");
	}
	
	@BeforeTest
	public void call()
	{
		launchApp();
	}
	
	
	@Test
	public void ValidUserLoginTest()
	{    
		Log.startTestCase("UserLoginToPayRoll");
		loginPage lp= new loginPage(driver);
		Log.info("Going to EnterUsername and Password");
		lp.UserName().click();
		lp.UserName().sendKeys("carol");
		lp.Password().click();
		lp.Password().sendKeys("1q2w3e4r");
		Log.info("Entered Username and Password");
		lp.Login().click();
		Log.endTestCase("ValidateUserLoginSuccess");
		Assert.assertEquals(false, true);
		//grouping
		//priority
		//DataProvider
		//Parameters
		//parallel
	}
}

