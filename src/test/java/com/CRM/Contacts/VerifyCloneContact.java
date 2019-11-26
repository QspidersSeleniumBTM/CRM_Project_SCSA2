package com.CRM.Contacts;

import org.testng.annotations.Test;

import com.CRM.Pages.CloneContactPage;
import com.CRM.genericLib.BaseTest;
import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.WebdriverCommonLib;

public class VerifyCloneContact extends BaseTest 
{
	WebdriverCommonLib wlib;
	FileLib flib;
	CloneContactPage ccp;
	
	@Test
	public void cloneContact() throws Throwable 
	{
		wlib=new WebdriverCommonLib();
		flib=new FileLib();
		ccp=new CloneContactPage(driver);
		
		ccp.clickContMod();
		wlib.verifyAssert(wlib.getPageTitle(), flib.getCellData(EXCEL_PATH, "CloneContact", 1, 0), "Custom Details Page");
		ccp.clickContList();
		wlib.verifyAssert(wlib.getPageTitle(), flib.getCellData(EXCEL_PATH, "CloneContact", 1, 1), "Contacts Detail Page");
		ccp.clickClnbtn();
		wlib.verifyAssert(wlib.getPageTitle(), flib.getCellData(EXCEL_PATH, "CloneContact", 1, 2), "Clone Contact Page");
		ccp.clickSavebtn();
		wlib.verifyAssert(wlib.getPageTitle(), flib.getCellData(EXCEL_PATH, "CloneContact", 1, 1), "Contacts Detail Page");
		wlib.verifyAssert(ccp.setVerifyCC(), flib.getCellData(EXCEL_PATH, "CloneContact", 1, 3), "Contact Cloned");
	}
}
