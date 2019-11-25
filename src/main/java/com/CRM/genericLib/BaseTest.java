package com.CRM.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.CRM.Pages.CRMLoginPage;
import com.CRM.Pages.HomePage;


public abstract class BaseTest implements IAutoConsts{

	public static WebDriver driver;
	FileLib flib;
	WebdriverCommonLib wlib;
	
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		flib=new FileLib();
		wlib=new WebdriverCommonLib();
		String browserValue = flib.getKeyPropValue(PROPERTY_PATH, "browser");
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
		
		String url = flib.getKeyPropValue(PROPERTY_PATH, "url");
		driver.get(url);
		String expectedTitle = flib.getCellData(EXCEL_PATH, "Invalid", 1, 4);
		wlib.verifyAssert(wlib.getPageTitle(), expectedTitle, "Login Page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@BeforeMethod(enabled=false)
	public void loginToApp() throws Throwable
	{
		flib=new FileLib();
		wlib=new WebdriverCommonLib();
		
		String username = flib.getKeyPropValue(PROPERTY_PATH, "username");
		String password = flib.getKeyPropValue(PROPERTY_PATH, "password");
		CRMLoginPage alp=new CRMLoginPage(driver);
		alp.login(username, password);
		String expectedHomeTitle = flib.getCellData(EXCEL_PATH, "Invalid", 1, 5);
		wlib.verifyAssert(wlib.getPageTitle(), expectedHomeTitle, "Home Page");
		
	}
	
	@AfterMethod(enabled=false)
	public void logoutFromApp() throws Throwable
	{
		Thread.sleep(3000);
		HomePage ettp=new HomePage(driver);
		ettp.clicklogoutLink();
		
		
	}
	
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}