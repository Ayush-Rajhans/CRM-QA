package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {

	HomePage homePage;
	LoginPage loginPage;

	public HomePageTest() {
		super();
	}

	@BeforeMethod

	public void SetUp() {
		initialization();
		homePage = new HomePage();
		loginPage = new LoginPage();
		homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 1)

	public void AdminNameTest() {
		Assert.assertTrue(homePage.ValidateAdminName(), "Correct Admin Name");
	}

	@Test(priority = 2)
	public void ValidateHomePageTitleTest() {
		String title = homePage.ValidateHomePageTitle();
		Assert.assertEquals(title, "CRM");
	}

	@Test(priority = 3)
	public void ValidateClickContactsTest() {
		homePage.ClickOnContacts();
	}

	@Test(priority = 4)
	public void ValidateClickTasksTest() {
		homePage.ClickOnTask();
	}

	@Test(priority = 5 )
	public void ValidateClickDealsTest() {
		homePage.ClickOnDeals();
	}

	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
