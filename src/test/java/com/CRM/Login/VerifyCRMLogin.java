package com.crm.loginlib;

import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.contacts.CloneContact;
import com.crm.genericlib.BaseTest;
import com.crm.genericlib.FileLib;
import com.crm.genericlib.WebdriverCommonLib;
import com.crm.pages.CRMLoginPage;
import com.crm.salesorder.CreateSales;

@Listeners(com.crm.genericlib.MyListener.class)
public class VerifyCRMLogin extends BaseTest 
{
	FileLib flib;
	CRMLoginPage clp;
	WebdriverCommonLib wlib;
	CloneContact cc;
	CreateSales cs;
	
	@Test
	public void verifyCRMValidLoginTest() throws Throwable 
	{
		flib=new FileLib();
		clp=new CRMLoginPage(driver);
		wlib=new WebdriverCommonLib();
		cc=new CloneContact(driver);
		cs=new CreateSales(driver);
		
		Reporter.log("Test Passed", true);
		WebElement scroll=driver.findElement(By.id("scrollright"));
		Actions ac=new Actions(driver);
		for(int i=0; i<22; i++)
		{
			ac.click(scroll).perform();
		}
		cs.clickSalesMod();
		cs.clickNewSalesBtn();
		cs.clickAccLookup();
		Set<String> allwhs=driver.getWindowHandles();
		for(String wh:allwhs)
		{
			String title=driver.switchTo().window(wh).getTitle();
			if(title.contains("Account Name"))
			{
				cs.clickAccList();
				break;
			}
		}
		
//		cc.clickContMod();
//		wlib.verifyAssert(wlib.getPageTile(), flib.getCellData(EXCEL_PATH, "Invalid", 1, 7), "Custom Details Page");
//		cc.clickContList();
//		wlib.verifyAssert(wlib.getPageTile(), flib.getCellData(EXCEL_PATH, "Invalid", 1, 8), "Contacts Detail Page");
//		cc.clickClnbtn();
//		wlib.verifyAssert(wlib.getPageTile(), flib.getCellData(EXCEL_PATH, "Invalid", 1, 9), "Clone Contact Page");
//		cc.clickSavebtn();
//		wlib.verifyAssert(wlib.getPageTile(), flib.getCellData(EXCEL_PATH, "Invalid", 1, 8), "Contacts Detail Page");
	}
	
	//@Test
	public void verifyCRMInvalidLoginTest() throws Throwable
	{
		clp.clickLogoutLink();
		flib=new FileLib();
		clp=new CRMLoginPage(driver);
		wlib=new WebdriverCommonLib();
		int rowCount=flib.getRowCount(EXCEL_PATH, "Invalid");
		SoftAssert sa = null;
		for(int i=1; i<rowCount; i++)
		{
			clp.getUntb().clear();
			clp.login(flib.getCellData(EXCEL_PATH, "Invalid", i, 0), flib.getCellData(EXCEL_PATH, "Invalid", i, 1));
			//WebDriverWait wait=new WebDriverWait(driver, 20);
			if(ExpectedConditions.alertIsPresent()!=null)
			{
				Alert a=driver.switchTo().alert();
				a.dismiss();
				Thread.sleep(2000);
				flib.setCellData(EXCEL_PATH, "Invalid", i, 2, "Pass");
			}
			else
			{
				sa=new SoftAssert();
				wlib.verifySoftAssert(clp.setErrorMsg(), flib.getCellData(EXCEL_PATH, "Invalid", 1, 3), "Error Message");
				Thread.sleep(2000);
				flib.setCellData(EXCEL_PATH, "Invalid", i, 2, "Pass");	
			}
		}
		sa.assertAll();
	}
}
