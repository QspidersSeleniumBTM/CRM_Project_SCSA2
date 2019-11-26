package com.potentials.module;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.Pages.CRMHomePage;
import com.CRM.Pages.CRMLoginPage;
import com.CRM.genericLib.BaseTest;
import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.WebdriverCommonLib;
import com.CRM.Pages.CreatePotentialPage;

public class VerifyCreatePotential extends BaseTest
{
	
	CRMHomePage chp;
	CRMLoginPage clp;
	FileLib flib;
	WebdriverCommonLib wlib;
	CreatePotentialPage cpp;
	
	@Test
	public void crmCreatePotential() throws Throwable 
	{
		chp=new CRMHomePage(driver);
		clp=new CRMLoginPage(driver);
		flib=new FileLib();
		wlib=new WebdriverCommonLib();
		cpp=new CreatePotentialPage(driver);
		
		Reporter.log("Home page is displayed --- passed",true);
		Thread.sleep(3000);
		System.out.println("IM HERE");
		cpp.clickPotMod();
	
		cpp.clickNewPotBtn();
		cpp.setPotNmTb(flib.getCellData(EXCEL_PATH, "createpotential", 1, 4));
		cpp.clickAccLook();
		String parentWh=driver.getWindowHandle();
		Set<String> allwhs=driver.getWindowHandles();
		for(String wh:allwhs)
		{
			String title=driver.switchTo().window(wh).getTitle();
			if(title.contains("Account Name"))
			{
				cpp.clickNextBtn();
				cpp.clickAccList();
				break;
			}
		}
		driver.switchTo().window(parentWh);
			//else
		//	{
				//cpp.clickNextBtn();
			//	cpp.clickAccList();
			//	break;
			//}
		
		
		cpp.setClsDate(flib.getCellData(EXCEL_PATH, "createpotential", 1, 5));
	/*	String parentWh1=driver.getWindowHandle();
		Set<String> allwhs1=driver.getWindowHandles();
		for(String wh:allwhs1)
		{
			String title=driver.switchTo().window(wh).getTitle();
			if(title.contains("Closing Date"))
			{
				
			
				break;
			}
		}*/
		//driver.switchTo().window(parentWh1);
		cpp.clickStageTb();
		wlib.selectOption(cpp.getStageDD(), 5);
		cpp.clickTypeDD();
		wlib.selectOption(cpp.getTypeDD(), 1);
		cpp.setAmtTB();
		cpp.clickLeadDD();
		wlib.selectOption(cpp.getLeadDD(), 1);
		cpp.clickSaveBtn();
	}
}
