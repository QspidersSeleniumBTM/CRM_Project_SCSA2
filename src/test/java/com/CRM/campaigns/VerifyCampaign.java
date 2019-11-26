package com.CRM.campaigns;

import org.testng.annotations.Test;

import com.CRM.Pages.Campaign;
import com.CRM.genericLib.BaseTest;
import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.WebdriverCommonLib;




public class VerifyCampaign extends BaseTest{
	FileLib flib;
	WebdriverCommonLib wlib;
	@Test
	public void VerifyCampaignDetails() throws Throwable
	{	flib=new FileLib();
	    wlib=new WebdriverCommonLib();
		Campaign c = new Campaign(driver);
		c.clickCmapaignbtn();
		wlib.verifyAssert(wlib.getPageTitle(), flib.getCellData(EXCEL_PATH, "CRMCampaign", 1, 0), "Campaign List page");
		c.clickNewCampaignbtn();
		wlib.verifyAssert(wlib.getPageTitle(), flib.getCellData(EXCEL_PATH, "CRMCampaign", 1, 1), "Create Campaign page");
		c.setCampName("Adhil");
		c.clickSavebtn();
		wlib.verifyAssert(wlib.getPageTitle(), flib.getCellData(EXCEL_PATH, "CRMCampaign", 1, 2), "Campaign Details page");
		c.clickedit();
		wlib.verifyAssert(wlib.getPageTitle(), flib.getCellData(EXCEL_PATH, "CRMCampaign", 1, 3), "Edit Campaign page");
		c.setexpRevenue("500000");
		c.clickSavebtn();
		c.clickclone();
		wlib.verifyAssert(wlib.getPageTitle(), flib.getCellData(EXCEL_PATH, "CRMCampaign", 1, 4), "Clone Campaign page");
		c.clickSavebtn();
		
		
	}

}

