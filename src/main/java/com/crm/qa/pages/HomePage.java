package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//*[contains(text(),'Ayush Rajhans')]")
	WebElement AdminName;

	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement Contacts;

	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	WebElement Deals;

	@FindBy(xpath = "//span[contains(text(),'Tasks')]")
	WebElement Tasks;

	// Initialize the Page Object

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	// Actions
	public boolean ValidateAdminName() {
		return AdminName.isDisplayed();

	}

	public String ValidateHomePageTitle() {
		return driver.getTitle();
	}

	public ContactsPage ClickOnContacts() {
		Contacts.click();
		return new ContactsPage();

	}

	public DealsPage ClickOnDeals() {
		Deals.click();
		return new DealsPage();
	}

	public TasksPage ClickOnTask() {
		Tasks.click();
		return new TasksPage();
	}

}
