package com.CRM.potentials;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.genericLib.BaseTest;
import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.WebdriverCommonLib;

import PotantialsPages.NewPotential;
import PotantialsPages.PoteantialPage;
import PotantialsPages.QuotesPage;
import PotantialsPages.ReportsPage;

public class Potential extends BaseTest {

	FileLib file;
	PoteantialPage pop;
	WebdriverCommonLib wdlib;
	NewPotential np;
	QuotesPage qm;
	
	ReportsPage rm;
	
	@Test(priority=1)
	public void verifyPotentail() throws Throwable {
		
		Thread.sleep(2000);
		pop=new PoteantialPage(driver);
		pop.clickOnPoteMod();
		
		Reporter.log(driver.getTitle(), true);
		
		wdlib=new WebdriverCommonLib();
		file=new FileLib();
		String expect = file.getCellData(EXCEL_PATH, "Sheet1", 1, 6);
		wdlib.verifyAssert(wdlib.getPageTitle(), expect, "potential Page");
	}
	
	
	@Test(priority=2)
	public void checkNewPotentails() throws Throwable {
		
		Thread.sleep(2000);
		pop=new PoteantialPage(driver);
		pop.clickOnPoteMod();
		
		
		Thread.sleep(2000);
		np=new NewPotential(driver);
		np.clickOnNewbtn();
		
		Reporter.log(driver.getTitle(), true);
		
		wdlib=new WebdriverCommonLib();
		file=new FileLib();
		
	}
	
	
	
	@Test(priority=3)
	public void verifyQouteMod() throws Throwable {
		
			Thread.sleep(2000);
			file=new FileLib();
			wdlib=new WebdriverCommonLib();
			qm=new QuotesPage(driver);
			qm.setQuote();
			Thread.sleep(2000);
			String t=wdlib.getPageTitle();
			file.setCellData(EXCEL_PATH,"sheet1",1,10,t);
			Thread.sleep(2000);
			wdlib.verifyAssert(t, file.getCellData(EXCEL_PATH, "Sheet1", 1, 10), "Quotes page");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}
	
	@Test(priority=4)
	public void clickReportsModule() throws Throwable {
		
		Thread.sleep(2000);
		file=new FileLib();
		wdlib=new WebdriverCommonLib();

		   rm=new ReportsPage(driver);
		   rm.setRepo();
		   Thread.sleep(2000);
		   String t=wdlib.getPageTitle();
		   file.setCellData(EXCEL_PATH, "Sheet1", 1, 11, t);
		   Thread.sleep(2000);
		   wdlib.verifyAssert(t, file.getCellData(EXCEL_PATH, "Sheet1", 1, 11), "Reports Module");
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	
	@Test(priority=5)
	public void checkPotentialName() throws Throwable {
		
		Thread.sleep(2000);
		file=new FileLib();
		wdlib=new WebdriverCommonLib();
		   rm=new ReportsPage(driver);
		   rm.setRepo();
		   Thread.sleep(2000);
		   rm.setPreport();
		   String rt=wdlib.getPageTitle();
		   file.setCellData(EXCEL_PATH, "Sheet1", 1, 12, rt);
		   Thread.sleep(2000);
		   wdlib.verifyAssert(rt, file.getCellData(EXCEL_PATH, "Sheet1", 1, 12), "Clicking potential report tab");
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   rm.clickCrtLink();
		   String t=wdlib.getPageTitle();
		   file.setCellData(EXCEL_PATH, "Sheet1", 1, 13, t);
		   Thread.sleep(2000);
		   wdlib.verifyAssert(t, file.getCellData(EXCEL_PATH, "Sheet1", 1, 13), "Checking Potential detail");
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
	}
	
	@Test(priority=6)
	public void verifyReports() throws Throwable {
		
		file=new FileLib();
		wdlib=new WebdriverCommonLib();
		   rm=new ReportsPage(driver);
		   rm.setRepo();
		   Thread.sleep(2000);
		   String t=wdlib.getPageTitle();
		   file.setCellData(EXCEL_PATH, "Sheet1", 1, 11, t);
		   Thread.sleep(2000);
		   wdlib.verifyAssert(t, file.getCellData(EXCEL_PATH, "Sheet1", 1, 11), "Reports page");
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		   	rm.setPreport();
			String rt=wdlib.getPageTitle();
			file.setCellData(EXCEL_PATH, "Sheet1", 1, 12, rt);
			Thread.sleep(2000);
			wdlib.verifyAssert(rt, file.getCellData(EXCEL_PATH, "Sheet1", 1, 12),"Clicking potential report tab");
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			rm.clickCrtLink();
			String t1=wdlib.getPageTitle();
			file.setCellData(EXCEL_PATH, "Sheet1", 1, 13, t1);/*setCellData(EXCEL_PATH,"sheet1",1,13,t);*/
			Thread.sleep(2000);
			wdlib.verifyAssert(t1, file.getCellData(EXCEL_PATH, "Sheet1", 1, 13), "Checking Potential detail");/*assertVerify(t,genlib.getExcelVal(EXCEL_PATH,"sheet1",1,13),"Checking Potential detail");*/
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			  
	}
	
	
	
}
