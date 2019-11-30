package com.leads.module;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.genericLib.BaseTest;
import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.WebdriverCommonLib;
import com.Leads.pages.CreateLead;
//import com.crm.pages.EnterCrmHomePage;
import com.Leads.pages.NewLead;
import com.Leads.pages.leadedit;
//mport com.crm.pages.leadssavebtn;

public class VerifyEdit extends BaseTest {
	FileLib flib;
	WebdriverCommonLib wlib;

	NewLead Nlead;
	CreateLead Clead;
	leadedit le;
	//leadssavebtn sbtn;
	public void edit() throws Throwable {
		
		Clead=new CreateLead(driver);
	
		
		flib=new FileLib();
		wlib=new WebdriverCommonLib();
		
		Thread.sleep(2000);
		Reporter.log(driver.getTitle(), true);
		Thread.sleep(2000);
		
		String EditleadsTitle = flib.getCellData(EXCEL_PATH, "Lead", 1, 6);
		wlib.verifyAssert(wlib.getPageTitle(), EditleadsTitle, "le");
		Thread.sleep(2000);
		
	}
	@Test(priority=2)
	public void save() throws Throwable {
			
//		sbtn=new leadssavebtn(driver);
//		sbtn.clicksave();
//		
			flib=new FileLib();
			wlib=new WebdriverCommonLib();
			
//		ec = new EnterCrmHomePage(driver);
//		ec.clicklogoutLink();
		
		



}}
