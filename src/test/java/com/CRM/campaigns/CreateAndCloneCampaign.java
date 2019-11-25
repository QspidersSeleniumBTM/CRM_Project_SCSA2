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
import com.CRM.Pages.CloneCampaignPage;
import com.CRM.Pages.CreateCampaignPage;
import com.CRM.Pages.ZohoCRMDisplayingCustomViewDetailsPage;
import com.CRM.Pages.ZohoCRMHomePage;

public class CreateAndCloneCampaign extends BaseTest {
	FileLib flib;
	WebdriverCommonLib wlib;
	ZohoCRMHomePage zchp;
	CRMLoginPage clp;
	CreateCampaignPage ccp;
	ZohoCRMDisplayingCustomViewDetailsPage zcdcvd;
	CampaignDetailsPage cdp;
	CloneCampaignPage clone;
	@Test
	public void verifyCloneCampaign() throws Throwable {
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
		String expectedHomeTitle = flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 9);
		wlib.verifyAssert(wlib.getPageTitle(), expectedHomeTitle, "campaign detail Page");
		
		zchp=new ZohoCRMHomePage(driver);
		zchp.clickCampaignlink();
		
		zcdcvd=new ZohoCRMDisplayingCustomViewDetailsPage(driver);
		zcdcvd.clickDellCampaignlink();
		
		String CampaignDetailsTitle = flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 9);
		wlib.verifyAssert(wlib.getPageTitle(), CampaignDetailsTitle, "campaign detail Page");
		
		cdp=new CampaignDetailsPage(driver);
		cdp.clickClonebtn();
		
		String cloneCampaignPageTitle = flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 12);
		wlib.verifyAssert(wlib.getPageTitle(), cloneCampaignPageTitle, "clone Campaign Page");
		
		clone=new CloneCampaignPage(driver);
		clone.clickSavebtn();
		
		String CampaignDetailsTitle1 = flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 9);
		wlib.verifyAssert(wlib.getPageTitle(), CampaignDetailsTitle1, "campaign detail Page after cloning");
		
		zchp=new ZohoCRMHomePage(driver);
		zchp.clickCampaignlink();
		
		
		zcdcvd=new ZohoCRMDisplayingCustomViewDetailsPage(driver);
		
		List<WebElement>alllinks=zcdcvd.getCampaignList();
		int count=0;
		int campaignListSize=alllinks.size();
		for (int i = 0; i < campaignListSize; i++) {
			String text = alllinks.get(i).getText();
			
			if(text.equals(flib.getCellData(EXCEL_PATH, "CreateCampaign", 1, 0))) {
				count++;
				
			}
		}
		
		if(count==2)
		{Reporter.log("cloned campaign displayed in campaign list",true);}
		else
		{Reporter.log("cloned campaign not displayed in campaign list",true);}
		
		
	}
}
