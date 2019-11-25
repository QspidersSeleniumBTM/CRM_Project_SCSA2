package com.crm.loginLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.crm.genericLib.BaseTest;
import com.crm.genericLib.FileLib;
import com.crm.genericLib.WebdriverCommonLib;
import com.crm.pages.CrmLoginPage;
import com.crm.pages.LeadDropdownPage;
import com.crm.pages.ZohoCrmHomePage;

public class VerifyCrmLogin extends BaseTest{

	ZohoCrmHomePage zchp;
	CrmLoginPage clp;
	FileLib flib;
	WebdriverCommonLib wlib;
	LeadDropdownPage ldp;
	
	
	
	@Test(enabled=true)
	public void verifyCrmValidLoginTest() throws Throwable  {
	
		Reporter.log("Home Page is Displayed==> PASSED",true);
		
		ldp = new LeadDropdownPage(driver);
		flib=new FileLib();
	    wlib=new WebdriverCommonLib();
	    
	    ldp.clickLead();
	    wlib.verifyAssert(wlib.getPageTitle(), flib.getCellData(EXCEL_PATH, "Invalid", 1, 6), "Lead List Page");
	    Thread.sleep(3000);
	    ldp.clickNewLead();
	    wlib.verifyAssert(wlib.getPageTitle(), flib.getCellData(EXCEL_PATH, "Invalid", 1, 7), "Create Lead Page");
	    
	    ldp.clickNameTitleDD();
	    wlib.selectOption(ldp.getNameTitleDD(),3);
	    
	    ldp.setFirName(flib.getCellData(EXCEL_PATH, "Values", 1, 0));
	    
	    ldp.setLasName(flib.getCellData(EXCEL_PATH, "Values", 1, 1));
	    
	    ldp.setComp(flib.getCellData(EXCEL_PATH, "Values", 1, 2));
	    
	    ldp.setDesg(flib.getCellData(EXCEL_PATH, "Values", 1, 3));
	    
	    ldp.setPhon(flib.getCellData(EXCEL_PATH, "Values", 1, 4));
	    
	    ldp.setMob(flib.getCellData(EXCEL_PATH, "Values", 1, 4));
	    
	    ldp.setEmail(flib.getCellData(EXCEL_PATH, "Values", 1, 5));
	    
	    ldp.setFax(flib.getCellData(EXCEL_PATH, "Values", 1, 6));
	    

	    ldp.clickLeadSrcDD();
	    wlib.selectOption(ldp.getLeadSrcDD(), 1);
	    
	    ldp.clickIndustryDD();
	    wlib.selectOption(ldp.getIndustryDD(), 5);
	    
	    ldp.clickLeadStatusDD();
	    wlib.selectOption(ldp.getLeadStatusDD(), 3);
	    
	    
	    
	    ldp.setWebst(flib.getCellData(EXCEL_PATH, "Values", 1, 7));
	    
	    ldp.setAnnRev(flib.getCellData(EXCEL_PATH, "Values", 1,8));
	    
	    ldp.clickRatingDD();
	    wlib.selectOption(ldp.getRatingDD(), 2);
	    
	    ldp.setNumOfEmp(flib.getCellData(EXCEL_PATH, "Values", 1, 9));
	    
	   /* ldp.clickCsLookup();
	    Set<String> allwhs = driver.getWindowHandles();
	    for(String wh:allwhs)
	    {
	    	String title=driver.switchTo().window(wh).getTitle();
	    	if(title.contains("Campaign Name"))
	    	{
	    		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    		jse.executeScript("document.getElementsByTagName('a')[0].click()");
	    		break;
	    	}
	    }*/
	    
	    ldp.setStrt(flib.getCellData(EXCEL_PATH, "Values", 1, 10));
	    
	    ldp.setCit(flib.getCellData(EXCEL_PATH, "Values", 1, 11));
	    
	    ldp.setStat(flib.getCellData(EXCEL_PATH, "Values", 1, 12));
	    
	    ldp.setCountr(flib.getCellData(EXCEL_PATH, "Values", 1, 13));
	    
	    ldp.setZipCode(flib.getCellData(EXCEL_PATH, "Values", 1, 14));
	    
	    ldp.clickSave();
	    Thread.sleep(3000);
	      
	}
	
	
	//@Test
	public void verifyCrmInvalidLoginTest() throws Throwable {
		flib=new FileLib();
		wlib=new WebdriverCommonLib();
		 zchp=new ZohoCrmHomePage(driver);
		 
		 zchp.clicklogoutLink();
		 
		 
		 clp=new CrmLoginPage(driver);
		 int rowCount = flib.getRowCount(EXCEL_PATH, "Invalid");
		 SoftAssert sa = null;
		 for(int i=1;i<=rowCount;i++)
		 {
		 clp.login(flib.getCellData(EXCEL_PATH, "Invalid", i, 0), flib.getCellData(EXCEL_PATH, "Invalid", i, 1));
		 sa=new SoftAssert();
		 sa.assertEquals(clp.setErrMsg(), flib.getCellData(EXCEL_PATH, "Invalid", 1, 3));
		 //wlib.verifySoftAssert(alp.setErrMsg(), flib.getCellData(EXCEL_PATH, "Invalid", 1, 3), "Error Message");
		 flib.setCellData(EXCEL_PATH, "Invalid", i, 2, "PASS");
		 
		 
		 }
		 sa.assertAll();
	}
}
