package com.leads.module;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.genericLib.BaseTest;
import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.WebdriverCommonLib;
import com.Leads.pages.leadlist;
import com.CRM.Pages.CreateLead;
import com.CRM.Pages.HomePage;
import com.CRM.Pages.NewLead;
import com.CRM.Pages.LeadsPage;

public class VerifyLeadlist extends BaseTest{
	FileLib flib;
	WebdriverCommonLib wlib;
	HomePage ec;
	LeadsPage lead;
	NewLead Nleads;
	CreateLead cl;
	leadlist ll;
	
        @Test(priority=1)
    	public void createleads() throws Throwable {
    			
    			ll=new leadlist(driver);
    			
    			flib=new FileLib();
    			wlib=new WebdriverCommonLib();
    			
    			Thread.sleep(2000);
    			Reporter.log(driver.getTitle(), true);
    			Thread.sleep(2000);
    			
    			String ListTitle = flib.getCellData(EXCEL_PATH, "Leads", 1, 8);
    			wlib.verifyAssert(wlib.getPageTitle(),ListTitle, "ll");
    			Thread.sleep(2000);
    			
    			
    			//ec = new EnterCrmHomePage(driver);
    			//ec.clicklogoutLink();

}

}
