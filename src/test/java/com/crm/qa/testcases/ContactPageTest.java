package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class ContactPageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;

	public ContactPageTest() {
		super();
	}
	
	@BeforeMethod
	
	public void SetUp() throws InterruptedException {
		
		initialization();
		Thread.sleep(30000);
		loginPage = new LoginPage();
		homePage = new HomePage();
		contactsPage = new ContactsPage();
		
		homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test
	public void CreateNewContactTest() throws InterruptedException {
		contactsPage.ClickOnContacts();
		contactsPage.CreateNewContact("Tom", "Jerry");
		
	}
	
	
	@AfterMethod
	
	public void TearDown() {
		//driver.quit();
	}
}
