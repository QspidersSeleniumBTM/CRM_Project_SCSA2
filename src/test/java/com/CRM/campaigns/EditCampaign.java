package com.CRM.campaigns;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.genericLib.BaseTest;
import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.WebdriverCommonLib;


import com.CRM.Pages.CRMLoginPage;
import com.CRM.Pages.CampaignDetailsPage;
import com.CRM.Pages.CreateCampaignPage;
import com.CRM.Pages.EditCampaignPage;
import com.CRM.Pages.ZohoCRMDisplayingCustomViewDetailsPage;
import com.CRM.Pages.ZohoCRMHomePage;

public class EditCampaign extends BaseTest{
	FileLib flib;
	WebdriverCommonLib wlib;
	ZohoCRMHomePage zchp;
	com.CRM.Pages.CRMLoginPage clp;
	CreateCampaignPage ccp;
	ZohoCRMDisplayingCustomViewDetailsPage zcdcvd;
	CampaignDetailsPage cdp;
	EditCampaignPage ec;
	
	//@Test
	public void verifyEditCampaign() throws Throwable {
		BaseTest btc=new BaseTest();
		wlib=new WebdriverCommonLib();
		zchp=new ZohoCRMHomePage(driver);
		flib=new FileLib();
		btc.loginToApp();
		Thread.sleep(2000);
		zchp.clickCampaignlink();
		
		String ZohoCRMDisplayingCustomViewDetailsTitle = flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 10);
		wlib.verifyAssert(wlib.getPageTitle(), ZohoCRMDisplayingCustomViewDetailsTitle, "Zoho CRM Displaying Custom View Details page");
		
		zcdcvd=new ZohoCRMDisplayingCustomViewDetailsPage(driver);
		zcdcvd.clickNewCampaignbtn();
		Thread.sleep(2000);
		ccp=new CreateCampaignPage(driver);
		
		String campaignName=flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 0);
		String startdate=flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 1);
		String expectedrevenue=flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 2);
		String actualCost=flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 3);
		String numsent=flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 4);
		String endtdate=flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 5);
		String budgetedCost=flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 6);
		String ExpectedResponse=flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 7);
		String description=flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 8);
		ccp.createCustomer(campaignName, startdate, expectedrevenue, actualCost, numsent, 
				endtdate, budgetedCost, ExpectedResponse, description);
		
		
		String campaigndetailTitle = flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 9);
		wlib.verifyAssert(wlib.getPageTitle(), campaigndetailTitle, "campaign detail Page");
		
		
		zchp=new ZohoCRMHomePage(driver);
		zchp.clickCampaignlink();
		
		
		String ZohoCRMDisplayingCustomViewDetailsPageTitle = flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 10);
		wlib.verifyAssert(wlib.getPageTitle(), ZohoCRMDisplayingCustomViewDetailsPageTitle, "campaign list Page");
		Thread.sleep(2000);
		
		zcdcvd=new ZohoCRMDisplayingCustomViewDetailsPage(driver);
		zcdcvd.clickDellCampaignlink();
		
		String CampaignDetailsTitle = flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 9);
		wlib.verifyAssert(wlib.getPageTitle(), CampaignDetailsTitle, "campaign detail Page");
		
		cdp=new CampaignDetailsPage(driver);
		cdp.clickEditbtn();
		
		String EditCampaignPageTitle = flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 11);
		wlib.verifyAssert(wlib.getPageTitle(), EditCampaignPageTitle, "Edit Campaign Page");
		
		
		ec=new EditCampaignPage(driver);
		ec.getCampaignnametb().clear();
		ec.setCampaignnametb(flib.getCellData(EXCEL_PATH, "CreateCampaign", 2, 0));
		Thread.sleep(3000);
		
		ec.clickSavebtn();
		String CampaignDetailsTitle1 = flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 9);
		
		wlib.verifyAssert(wlib.getPageTitle(), CampaignDetailsTitle1, "campaign detail Page after editing");
		
		
		zchp=new ZohoCRMHomePage(driver);
		zchp.clickCampaignlink();
		
		
		
		zcdcvd=new ZohoCRMDisplayingCustomViewDetailsPage(driver);
		List<WebElement>alllinks=zcdcvd.getCampaignList();
		
		int campaignListSize=alllinks.size();
		for (int i = 0; i < campaignListSize; i++) {
			WebElement link=alllinks.get(i);
			String text = alllinks.get(i).getText();
			if(text.equals(flib.getCellData(EXCEL_PATH, "CreateCampaign", 2, 0))) {
				
				Reporter.log("edited campaign displayed",true);
				
				break;
			}
		}
		

	}
}
