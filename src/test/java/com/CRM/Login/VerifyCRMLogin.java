package com.crm.loginLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.genericlibrary.BaseTest;
import com.crm.genericlibrary.FileLibrary;
import com.crm.genericlibrary.WebDriverCommonLibrary;
import com.crm.pages.CRMHomePage;
import com.crm.pages.CRMLoginPage;
import com.crm.pages.CreatePotential;

public class VerifyCRMLogin extends BaseTest
{
	
	WebDriver driver;
	CRMHomePage chp;
	CRMLoginPage clp;
	FileLibrary flib;
	WebDriverCommonLibrary wlib;
	CreatePotential cp;
	
	@Test
	public void crmLogin() throws Throwable 
	{
		chp=new CRMHomePage(driver);
		clp=new CRMLoginPage(driver);
		flib=new FileLibrary();
		wlib=new WebDriverCommonLibrary();
		cp=new CreatePotential(driver);
		
		Reporter.log("Home page is displayed --- passed",true);
		cp.clickPotMod();
		cp.clickNewPotBtn();
		cp.setPotNmTb(flib.getCellData(EXCEL_PATH, "Sheet1", 1, 0));
		cp.clickAccLook();
		Set<String> allwhs=driver.getWindowHandles();
		for(String wh:allwhs)
		{
			String title=driver.switchTo().window(wh).getTitle();
			if(title.contains("Account Name"))
			{
				cp.clickAccList();
				break;
			}
			else
			{
				cp.clickNextBtn();
				cp.clickAccList();
				break;
			}
		}
		cp.clickClsDate();
		Set<String> allwhs1=driver.getWindowHandles();
		for(String wh:allwhs1)
		{
			String title=driver.switchTo().window(wh).getTitle();
			if(title.contains("Closing Date"))
			{
				JavascriptExecutor jse=(JavascriptExecutor)driver;
				jse.executeScript("document.getElementByTagName('a')[29].click()");
				break;
			}
		}
		cp.clickStageTb();
		wlib.selectOption(cp.getStageDD(), 5);
		cp.clickTypeDD();
		wlib.selectOption(cp.getTypeDD(), 1);
		cp.setAmtTB();
		cp.clickLeadDD();
		wlib.selectOption(cp.getLeadDD(), 1);
		cp.clickSaveBtn();
	}
}