package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void SetUp() {
		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void LoginPageTitleTest() {
		String title = loginPage.ValidateLoginPageTitle();
		Assert.assertEquals(title, "Free CRM software for any Business");
	}

	@Test(priority = 2)
	public void LoginTest() {
		homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod

	public void TearDown() {
		driver.quit();
	}
}
