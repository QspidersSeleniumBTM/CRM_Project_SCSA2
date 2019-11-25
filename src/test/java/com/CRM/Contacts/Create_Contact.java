package com.cinnosti.contacts;

import java.util.Set;

import org.testng.annotations.Test;

import com.zoho.genriclibraries.BaseClass;
import com.zoho.genriclibraries.File_Libraries;
import com.zoho.genriclibraries.WebdriverGenericMethods;
import com.zoho.pages.Create_AllContacts_Page;
import com.zoho.pages.Create_Contact_page;
import com.zoho.pages.Create_Lead_Page;

@Listeners(com.zoho.basics.MyListeners.class)
public class Create_Contact extends BaseClass {
	com.zoho.genriclibraries.WebdriverGenericMethods wgm;
	Create_Lead_Page clp;
	Create_Contact_page ccp;
	File_Libraries flib=new File_Libraries();
	Create_AllContacts_Page cap;
	@Test
	public void createContact() throws Throwable {
		wgm = new WebdriverGenericMethods();
		ccp=new Create_Contact_page(driver);
		cap=new Create_AllContacts_Page(driver);
		ccp.clickContact();
		String actual1=wgm.getPageTitle();
		String expected1=flib.getCellData(EXCEL_PATH, "Title", 23, 0);
		wgm.verifyAssert(actual1, expected1, "Contacts: All Contacts Page");
		cap.clickNewContact();
		String createNewContactWH=driver.getWindowHandle();
		String actual2=wgm.getPageTitle();
		String expected2=flib.getCellData(EXCEL_PATH, "Title", 25, 0);
		wgm.verifyAssert(actual2, expected2, "Create Contact Page");
		ccp.setLN(flib.getKeyPropVlaue(CONTACT_PROPPATH, "lastname"));
		ccp.setFN(flib.getKeyPropVlaue(CONTACT_PROPPATH, "firstname"));
		ccp.clickANK();
		Set<String> whs = driver.getWindowHandles();
		for(String wh:whs) {
			String title=driver.switchTo().window(wh).getTitle();
			if(!title.equals(actual2)) {
				ccp.clickNext();
				ccp.selectAccount();
			}
		} wgm.switchWindow(createNewContactWH);
		ccp.setMS(flib.getKeyPropVlaue(CONTACT_PROPPATH, "mailingstreet"));
		ccp.clickCopyAds();
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
		ccp.selectMailingTO();
		ccp.clickSave();
		String actual3=wgm.getPageTitle();
		String expected3=flib.getCellData(EXCEL_PATH, "Title", 27, 0);
		wgm.verifyAssert(actual3, expected3, "Contact Details Page");
		
	}
}
