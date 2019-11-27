package com.leads.module;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.genericLib.BaseTest;
import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.WebdriverCommonLib;
import com.Leads.pages.CreateLead;

import com.Leads.pages.NewLead;
import com.Leads.pages.leadedit;

import com.Leads.pages.leadsclone;


public class VerifyClone extends BaseTest {
	FileLib flib;
	WebdriverCommonLib wlib;
//	EnterCrmHomePage ec;
//	leadmodule lead;
	NewLead Nlead;
	CreateLead Clead;
	leadedit le;
	leadsclone lc;
	//leadssavebtn sbtn;
	public void edit() throws Throwable {
		
		lc=new leadsclone(driver);
	
		
		flib=new com.CRM.genericLib.FileLib();
		wlib=new com.CRM.genericLib.WebdriverCommonLib();
		
		Thread.sleep(2000);
		Reporter.log(driver.getTitle(), true);
		Thread.sleep(2000);
		
		String cloneleadsTitle = flib.getCellData(EXCEL_PATH, "Lead", 1, 7);
		wlib.verifyAssert(wlib.getPageTitle(), cloneleadsTitle, "le");

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
//		
		



}

}
