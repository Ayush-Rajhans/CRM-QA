package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Free CRM software for any Business
	//PageFactory OR
	
	
	@FindBy(xpath = "//*[contains(text(),'Log In')]")
	WebElement Login;
    
	@FindBy(name = "email")
	WebElement UserName;
	
	@FindBy(name = "password")
	WebElement Password ;
	
	@FindBy(xpath = "//*[contains(text(),'Login')]")
	WebElement LoginBtn ;
	
	//Initialize Page Object
	
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage Login(String un , String pw) {
		
		Login.click();
		UserName.sendKeys(un);
		Password.sendKeys(pw);
		LoginBtn.click();
		return new HomePage();
		
		
		
		
		
		
		
	}
	
}
