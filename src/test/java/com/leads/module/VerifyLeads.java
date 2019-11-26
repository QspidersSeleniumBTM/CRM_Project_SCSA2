package com.leads.module;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.genericLib.BaseTest;
import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.WebdriverCommonLib;
import com.CRM.Pages.HomePage;
import com.CRM.Pages.LeadsPage;


public class VerifyLeads extends BaseTest {
	FileLib flib;
	WebdriverCommonLib wlib;
	HomePage ec;
	LeadsPage lead;
        @Test(priority=1)
    	public void leads() throws Throwable {
    			
    			lead=new LeadsPage(driver);
    			lead.leadsmod();
    			
    			flib=new FileLib();
    			wlib=new WebdriverCommonLib();
    			
    			Thread.sleep(2000);
    			Reporter.log(driver.getTitle(), true);
    			Thread.sleep(2000);
    			
    			String leadsTitle = flib.getCellData(EXCEL_PATH, "Leads", 1, 0);
    			wlib.verifyAssert(wlib.getPageTitle(), leadsTitle, "lead");
    			Thread.sleep(2000);
    			
    			
    			//ec = new EnterCrmHomePage(driver);
    			//ec.clicklogoutLink();
    			
    			
    	}}

	
