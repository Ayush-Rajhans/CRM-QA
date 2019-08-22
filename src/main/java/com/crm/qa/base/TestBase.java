package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop ;
	
	
	// Test Base Class Constructor 
	
	public TestBase() {
		
		prop = new Properties ();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\Ayush\\eclipse-workspace\\CRMAutomatin\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		    try {
				prop.load(ip);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void initialization() {
		String BrowserName = prop.getProperty("Browser");
		
		if(BrowserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ayush\\Downloads\\crm\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TimeOut, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicity_Wait, TimeUnit.SECONDS);
		
		//Launch Url
		
		driver.get(prop.getProperty("url"));
		
		
		
		
		
		
		
		
		
		
	}
}
