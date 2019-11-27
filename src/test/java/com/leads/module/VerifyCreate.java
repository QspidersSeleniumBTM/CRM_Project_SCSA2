package com.leads.module;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.genericLib.BaseTest;
import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.WebdriverCommonLib;
import com.Leads.pages.CreateLead;
//import com.Leads.pages.EnterCrmHomePage;
import com.Leads.pages.NewLead;
//import com.Leads.pages.leadmodule;
//import com.Leads.pages.leadssavebtn;

public class VerifyCreate extends BaseTest {
	FileLib flib;
	WebdriverCommonLib wlib;
//	EnterCrmHomePage ec;
//	leadmodule lead;
	NewLead Nlead;
	CreateLead Clead;
	//leadssavebtn sbtn;
@Test(priority=1)
public void createleads() throws Throwable {
	
	Clead=new CreateLead(driver);

	flib=new FileLib();
	wlib=new WebdriverCommonLib();
	
	Thread.sleep(2000);
	Reporter.log(driver.getTitle(), true);
	Thread.sleep(2000);
	
	String CreateleadsTitle = flib.getCellData(EXCEL_PATH, "Lead", 1, 5);
	wlib.verifyAssert(wlib.getPageTitle(), CreateleadsTitle, "Clead");
	Thread.sleep(2000);
	
}
@Test(priority=2)
public void save() throws Throwable {
		
//	sbtn=new leadssavebtn(driver);
//	sbtn.clicksave();
//	
		flib=new FileLib();
		wlib=new WebdriverCommonLib();
		
		
		
//		
//		ec = new EnterCrmHomePage(driver);
//		ec.clicklogoutLink();
//		
		


}}
