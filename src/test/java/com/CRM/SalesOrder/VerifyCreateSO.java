package com.CRM.SalesOrder;


import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.Pages.HomePage;
import com.CRM.Pages.SalesOrderModulePage;
import com.CRM.genericLib.BaseTest;
import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.WebdriverCommonLib;
import com.compaign.pages.CrmLoginPage;

public class VerifyCreateSO extends BaseTest
{
	HomePage ettp;
	CrmLoginPage clp;
	FileLib flib;
	WebdriverCommonLib wlib;
	SalesOrderModulePage som;

	@Test
	public void verifyCreateSO() throws Throwable  
	{
		flib=new FileLib();
		wlib=new WebdriverCommonLib();
		clp=new CrmLoginPage(driver); 
		ettp=new HomePage(driver);
		som=new SalesOrderModulePage(driver);

		Reporter.log("Home Page is Displayed==> PASSED",true);
		som=new SalesOrderModulePage(driver);
		String mainwh=driver.getWindowHandle();

		WebElement scroll=driver.findElement(By.id("scrollright"));
		Actions ac=new Actions(driver);	
		for(int i=0;i<=30;i++)
		{
			ac.click(scroll).perform();
		}

		som.clickSalesModu();
		som.clickNewSo();

		som.setSubTB(flib.getCellData(EXCEL_PATH, "CreateSO", 1, 7));
		som.setCustTB(flib.getCellData(EXCEL_PATH, "CreateSO", 1, 8));
		som.clickCarrDD();
		wlib.selectOption(som.getCarrDD(), flib.getCellData(EXCEL_PATH, "CreateSO", 1, 9));
		som.setSalecmn(flib.getCellData(EXCEL_PATH, "CreateSO", 1, 10));

		som.setDueDateTb(flib.getCellData(EXCEL_PATH, "CreateSO", 1, 12));

		som.clickQutTB();
		Set<String> allwhs=driver.getWindowHandles();
		for(String wh:allwhs)
		{
			String title=driver.switchTo().window(wh).getTitle();
			if(title.contains("Quote Name Lookup"))
			{
				som.clickQut();
				break;
			}
		}	
		driver.switchTo().window(mainwh);
		som.clickSave();
	}
}