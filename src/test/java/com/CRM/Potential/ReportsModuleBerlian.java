package com.CRM.Potential;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.Berlian.Pages.ReportsModule;
import com.CRM.genericLib.BaseTest;
import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.WebdriverCommonLib;

public class ReportsModuleBerlian extends BaseTest {
	
	FileLib genlib;
	WebdriverCommonLib wclb;
	ReportsModule rm;
	
	
	@Test(priority=1)
	public void clickReportsModule()throws Throwable
	{
	   genlib=new FileLib();
	   wclb=new WebdriverCommonLib();
	   rm=new ReportsModule(driver);
	   rm.setRepo();
	   Thread.sleep(2000);
	   String t=wclb.getPageTitle();
	   genlib.setCellData(EXCEL_PATH,"sheet1",1,11,t);
	   Thread.sleep(2000);
	   wclb.verifyAssert(t,genlib.getCellData(EXCEL_PATH,"sheet1",1,11),"Reports Module");
	   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   
	}
	
	
	@Test(priority=2)
	public void checkPotentialName()throws Throwable
	{
		genlib=new FileLib();
		   wclb=new WebdriverCommonLib();
		   rm=new ReportsModule(driver);
		   rm.setRepo();
		   Thread.sleep(2000);
		   rm.setPreport();
		   String rt=wclb.getPageTitle();
		   genlib.setCellData(EXCEL_PATH,"sheet1",1,12,rt);
		   Thread.sleep(2000);
		   wclb.verifyAssert(rt,genlib.getCellData(EXCEL_PATH,"sheet1",1,12),"Clicking potential report tab");
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   rm.clickCrtLink();
		   String t=wclb.getPageTitle();
		   genlib.setCellData(EXCEL_PATH,"sheet1",1,13,t);
		   Thread.sleep(2000);
		   wclb.verifyAssert(t,genlib.getCellData(EXCEL_PATH,"sheet1",1,13),"Checking Potential detail");
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   
	  
	}


}
