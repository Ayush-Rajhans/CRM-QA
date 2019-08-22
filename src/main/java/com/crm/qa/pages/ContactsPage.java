package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath = "//*[contains(text(),'Contacts')]")
	WebElement Contacts;

	@FindBy(name = "first_name")
	WebElement FirstName;

	@FindBy(name = "last_name")
	WebElement LastName;

	@FindBy(xpath = "//*[contains(text() ,'Save')]")
	WebElement SaveBtn;

	public void initializePageFactor() {
		PageFactory.initElements(driver, this);
	}

	public ContactsPage ClickOnContacts() {
		Contacts.click();
		return new ContactsPage();

	}

	public void CreateNewContact(String ftName, String ltName) {
		FirstName.sendKeys(ftName);
		LastName.sendKeys(ltName);
		SaveBtn.click();
	}
}
