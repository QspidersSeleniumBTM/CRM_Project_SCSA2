package com.CRM.Contacts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.CRM.Pages.Create_AllContacts;
import com.CRM.Pages.Create_Contact_page;
import com.CRM.genericLib.BaseTest;
import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.WebdriverCommonLib;

@Listeners(com.CRM.genericLib.MyListener.class)
public class Create_Contact extends BaseTest {
	WebdriverCommonLib wcl;
	Create_Contact_page ccp;
	FileLib flib = new FileLib();
	Create_AllContacts cap;
	BaseTest bt=new BaseTest();
	
	@Test
	public void createContact() throws Throwable {
		
		bt.openBrowser("chrome", flib.getCellData(EXCEL_PATH, "Contacts", 1, 5));
		bt.loginToApp();
		wcl = new WebdriverCommonLib();
		ccp=new Create_Contact_page(driver);
		cap=new Create_AllContacts(driver);
		ccp.clickContact();
		String actual1=wcl.getPageTitle();
		String expected1=flib.getCellData(EXCEL_PATH, "Contacts", 23, 0);
		wcl.verifyAssert(actual1, expected1, "Contacts: All Contacts Page");
		cap.clickNewContact();
		String actual2=wcl.getPageTitle();
		String expected2=flib.getCellData(EXCEL_PATH, "Contacts", 25, 0);
		wcl.verifyAssert(actual2, expected2, "Create Contact Page");
		ccp.setLN(flib.getCellData(EXCEL_PATH, "Contacts", 1, 2));
		ccp.setMS(flib.getCellData(EXCEL_PATH, "Contacts", 1, 3));
		ccp.clickCopyAds();
		ccp.clickMTO();
		ccp.clickSave();
		String actual3=wcl.getPageTitle();
		String expected3=flib.getCellData(EXCEL_PATH, "Contacts", 27, 0);
		wcl.verifyAssert(actual3, expected3, "Contact Details Page");
		
	}
}
