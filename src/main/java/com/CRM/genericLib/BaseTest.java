package com.CRM.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.CRM.Pages.CRMHomePage;
import com.CRM.Pages.Signin;


public class BaseTest implements IAutoConsts{

	
	public static WebDriver driver;
	FileLib flib;
	WebdriverCommonLib wlib;
	Signin sign;
	CRMHomePage chp;
	

	public void openBrowser(String browserValue,String url) throws Throwable
	{
		flib=new FileLib();
		wlib=new WebdriverCommonLib();
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		else
		{
			Reporter.log("Enter Correct Browser Name",true);
		}
		driver.get(url);
		String expectedTitle = flib.getCellData(EXCEL_PATH, "Contacts",3, 0);
		wlib.verifyAssert(wlib.getPageTitle(), expectedTitle, "Login Page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void loginToApp() throws Throwable
	{
		flib=new FileLib();
		wlib=new WebdriverCommonLib();
		
		String username = flib.getKeyPropValue(PROPERTY_PATH, "username");
		String password = flib.getKeyPropValue(PROPERTY_PATH, "password");
		sign=new Signin(driver);
		sign.signIn(username, password);
		String expectedHomeTitle = flib.getCellData(EXCEL_PATH, "Contacts", 5, 0);
		wlib.verifyAssert(wlib.getPageTitle(), expectedHomeTitle, "Home Page");
		
	}
	
	@AfterMethod(enabled=false)
	public void logoutFromApp() throws Throwable
	{
		Thread.sleep(3000);
		chp=new CRMHomePage(driver);
		chp.clickLogOutLink();
		
		
	}
	
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
