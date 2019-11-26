package com.CRM.Potential;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.Berlian.Pages.QuotesModule;
import com.CRM.genericLib.BaseTest;
import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.WebdriverCommonLib;

public class QuoteModuleBerlian extends BaseTest {

	
	FileLib genlib;
	WebdriverCommonLib wclb;
	QuotesModule qm;
	
	
	@Test
	public void clickQuoteModule()throws Throwable
	{
		genlib=new FileLib();
		wclb=new WebdriverCommonLib();
		qm=new QuotesModule(driver);
		qm.setQuote();
		Thread.sleep(2000);
		String t=wclb.getPageTitle();
		genlib.setCellData(EXCEL_PATH,"sheet1",1,10,t);
		Thread.sleep(2000);
		wclb.verifyAssert(t,genlib.getCellData(EXCEL_PATH,"sheet1",1,10),"Quotes Module");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		
	}

}
