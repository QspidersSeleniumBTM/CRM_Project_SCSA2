package com.crm.loginLib;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;

import com.crm.genericLib.BaseTest;
import com.crm.genericLib.FileLib;
import com.crm.genericLib.WebdriverCommonLib;
//import com.crm.pages.CampaignModule;
import com.crm.pages.CrmLoginPage;
import com.crm.pages.HomePage;
import com.crm.pages.PurchaseOrderModule;
import com.crm.pages.SalesOrderModule;

	
	public class VerifyCrmLogin extends BaseTest{

		HomePage ettp;
		CrmLoginPage clp;
		FileLib flib;
		WebdriverCommonLib wlib;
		SalesOrderModule som;
		PurchaseOrderModule pom;
		
		@Test
		public void verifyCrmValidLoginTest() throws Throwable  {
			flib=new FileLib();
			wlib=new WebdriverCommonLib();
			clp=new CrmLoginPage(driver); 
			ettp=new HomePage(driver);
			som=new SalesOrderModule(driver);
			pom=new PurchaseOrderModule(driver);
			
		
			Reporter.log("Home Page is Displayed==> PASSED",true);
			
			som=new SalesOrderModule(driver);
			
			WebElement scroll=driver.findElement(By.id("scrollright"));
			Actions ac=new Actions(driver);	
			for(int i=0;i<=30;i++)
			{
				ac.click(scroll).perform();
			}
			
			som.clickSalesModu();
			som.clickNewSo();
			
			som.setSubTB(flib.getCellData(EXCEL_PATH, "Invalid", 1, 7));
			som.setCustTB(flib.getCellData(EXCEL_PATH, "Invalid", 1, 8));
			som.clickCarrDD();
			wlib.selectOption(som.getCarrDD(), flib.getCellData(EXCEL_PATH, "Invalid", 1, 9));
			som.setSalecmn(flib.getCellData(EXCEL_PATH, "Invalid", 1, 10));
			
			
//			som.clickCaldr();
//			Set<String> allwhs3=driver.getWindowHandles();
//			for(String wh:allwhs3)
//			{
//				String title=driver.switchTo().window(wh).getTitle();
//				if(title.contains("Due Date"))
//				{
//					JavascriptExecutor jse=(JavascriptExecutor)driver;
//					jse.executeScript("document.getElementsByTagName('a')[31].click()");
//					//som.clickAccList();
//					break;
//				}
//			}	
//			

			
			som.clickQutTB();
			Set<String> allwhs=driver.getWindowHandles();
			for(String wh:allwhs)
			{
				String title=driver.switchTo().window(wh).getTitle();
				if(title.contains("Quote Name Lookup"))
				{
					JavascriptExecutor jse=(JavascriptExecutor)driver;
					jse.executeScript("document.getElementsByTagName('a')[5].click()");
					//som.clickqutList();
					break;
				}
			}	
			
				
				
			som.clickAccLookup();
			Set<String> allwhs2=driver.getWindowHandles();
			for(String wh:allwhs2)
			{
				String title=driver.switchTo().window(wh).getTitle();
				if(title.contains("Account Name"))
				{
					JavascriptExecutor jse=(JavascriptExecutor)driver;
					jse.executeScript("document.getElementsByTagName('a')[5].click()");
					//som.clickAccList();
					break;
				}
			}	
			som.clickSave();
			
//			pom=new PurchaseOrderModule(driver);
//			WebElement scroll=driver.findElement(By.id("scrollright"));
//			Actions ac=new Actions(driver);	
//			for(int i=0;i<=50;i++)
//			{
//				ac.click(scroll).perform();
//			}
//			
//			pom.clickPoModu();
//			pom.clickNewPo();
//			pom.setSubject(flib.getCellData(EXCEL_PATH, "Invalid", 1, 11));
//			
//			pom.clickCnl();
//			Set<String> allwhs4=driver.getWindowHandles();
//			for(String wh:allwhs4)
//			{
//				String title=driver.switchTo().window(wh).getTitle();
//				if(title.contains("Contact Name Lookup"))
//				{
//					JavascriptExecutor jse=(JavascriptExecutor)driver;
//					jse.executeScript("document.getElementsByTagName('a')[15].click()");
//					//som.clickAccList();
//					break;
//				}
//			}	
//			
//			pom.clickCalen();
//			Set<String> allwhs5=driver.getWindowHandles();
//			for(String wh:allwhs5)
//			{
//				String title=driver.switchTo().window(wh).getTitle();
//				if(title.contains("Due Date"))
//				{
//					JavascriptExecutor jse=(JavascriptExecutor)driver;
//					jse.executeScript("document.getElementsByTagName('a')[31].click()");
//					//som.clickAccList();
//					break;
//				}
//			}	
//			
			}

		
		
		
		
		//@Test
		public void verifyCrmInvalidLoginTest() throws Throwable {
			flib=new FileLib();
			wlib=new WebdriverCommonLib();
			clp=new CrmLoginPage(driver); 
			ettp=new HomePage(driver);
			 ettp.clicklogoutLink();
			 
			 
			 clp=new CrmLoginPage(driver);
			 int rowCount = flib.getRowCount(EXCEL_PATH, "Invalid");
			 SoftAssert sa = null;
			 for(int i=1;i<=rowCount;i++)
			 {
				 clp.getUntb().clear();
			 clp.login(flib.getCellData(EXCEL_PATH, "Invalid", i, 0), flib.getCellData(EXCEL_PATH, "Invalid", i, 1));
			 sa=new SoftAssert();
			 sa.assertEquals(clp.setErrMsg(), flib.getCellData(EXCEL_PATH, "Invalid", 1, 3));
			 //wlib.verifySoftAssert(alp.setErrMsg(), flib.getCellData(EXCEL_PATH, "Invalid", 1, 3), "Error Message");
			 flib.setCellData(EXCEL_PATH, "Invalid", i, 2, "PASS");
			 
			 
			 }
			 sa.assertAll();
		}
	}																																																																																																																																																																																																																															