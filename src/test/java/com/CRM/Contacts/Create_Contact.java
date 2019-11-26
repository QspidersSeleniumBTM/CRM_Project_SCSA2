package com.CRM.Contacts;

import java.awt.Robot;

import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.sun.glass.events.KeyEvent;
import com.CRM.Pages.*;

import com.CRM.genericLib.*;

//@Listeners(com.zoho.basics.MyListeners.class)
public class Create_Contact extends BaseTest {
	WebdriverCommonLib wcl;
	Create_Contact_page ccp;
	FileLib flib = new FileLib();
	Create_AllContacts cap;
	@Test
	public void createContact() throws Throwable {
		wcl = new WebdriverCommonLib();
		ccp=new Create_Contact_page(driver);
		cap=new Create_AllContacts(driver);
		ccp.clickContact();
		String actual1=wcl.getPageTitle();
		String expected1=flib.getCellData(EXCEL_PATH, "Title", 23, 0);
		wcl.verifyAssert(actual1, expected1, "Contacts: All Contacts Page");
		cap.clickNewContact();
		String actual2=wcl.getPageTitle();
		String expected2=flib.getCellData(EXCEL_PATH, "Title", 25, 0);
		wcl.verifyAssert(actual2, expected2, "Create Contact Page");
		ccp.setLN(flib.getKeyPropValue(CONTACT_PROPPATH, "lastname"));
		ccp.setMS(flib.getKeyPropValue(CONTACT_PROPPATH, "mailingstreet"));
		//ccp.clickCopyAds();
		//Thread.sleep(2000);
		//wgm.selectOption(ccp.getCopyAds(), 0);
		//Thread.sleep(1000);
		//Robot r = new Robot();
		
	//	r.keyPress(KeyEvent.VK_DOWN);
	//	r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_DOWN);
	//	r.keyRelease(KeyEvent.VK_ENTER);
		//ccp.getCopyAds().sendKeys(Keys.DOWN);
	
		//ccp.getCopyAds().sendKeys(Keys.ENTER);
		//Thread.sleep(1000);
		ccp.clickSave();
		String actual3=wcl.getPageTitle();
		String expected3=flib.getCellData(EXCEL_PATH, "Title", 27, 0);
		wcl.verifyAssert(actual3, expected3, "Contact Details Page");
		
	}
}
