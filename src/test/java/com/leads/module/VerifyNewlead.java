package com.leads.module;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.genericLib.BaseTest;
import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.WebdriverCommonLib;
import com.CRM.Pages.HomePage;
import com.CRM.Pages.NewLead;
//import com.CRM.Pages.leadsPage;

public class VerifyNewlead extends BaseTest{
	FileLib flib;
	WebdriverCommonLib wlib;
	HomePage ec;
	//leadPage lead;
	NewLead Nleads;
	@Test(priority=1)
	public void Newleads() throws Throwable {
			
			Nleads=new NewLead(driver);
			Nleads.clicknewleadsbtn();
			
			flib=new FileLib();
			wlib=new WebdriverCommonLib();
			
			Thread.sleep(2000);
			Reporter.log(driver.getTitle(), true);
			Thread.sleep(2000);
			
			String NewleadsTitle = flib.getCellData(EXCEL_PATH, "Leads", 1, 1);
			wlib.verifyAssert(wlib.getPageTitle(), NewleadsTitle, "Nleads");
			Thread.sleep(2000);
			
			
			//ec = new EnterCrmHomePage(driver);
			//ec.clicklogoutLink();
			
			
	}}


