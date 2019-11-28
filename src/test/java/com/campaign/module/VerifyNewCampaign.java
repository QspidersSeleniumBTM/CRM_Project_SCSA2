package com.campaign.module;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.CRM.genericLib.BaseTest;
import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.WebdriverCommonLib;
import com.compaign.pages.CreateCampaign;
import com.compaign.pages.CreateCampaignPage;
import com.compaign.pages.CreateNewCampaign;
import com.compaign.pages.ZohoCRMHomePage;

public class VerifyNewCampaign extends com.CRM.genericLib.BaseTest {
	CreateNewCampaign creNca ;
	CreateCampaign cc;
	CreateCampaignPage ccP;
	FileLib flib;
	ZohoCRMHomePage zc;
	WebdriverCommonLib wcbl;

	@Test(enabled = false)
	public void verifyCampaign() throws Throwable {

		cc=new CreateCampaign(driver);
		flib=new FileLib();
		Thread.sleep(3000);
		cc.clickCampaignTab();
		zc=new ZohoCRMHomePage(driver);

		wcbl=new WebdriverCommonLib();
		Thread.sleep(2000);
		zc.clickLogOut();
		//Thread.sleep(2000);
		//	
		//
		//		ccP.setCampaignName(flib.getCellData(EXCEL_PATH, "Sheet4", 0, 1));
	}


	@Test(enabled = false)
	public void verifyClickNewCamp() throws Throwable {

		cc=new CreateCampaign(driver);
		cc.clickCampaignTab();

		Thread.sleep(1000);
		creNca=new CreateNewCampaign(driver);
		creNca.clickNewCampaign();

		Reporter.log(driver.getTitle(), true);

		zc=new ZohoCRMHomePage(driver);
		zc.clickLogOut();
	}

	@Test
	public void VerifyCampaignNAme() throws Throwable {
		cc=new CreateCampaign(driver);
		cc.clickCampaignTab();
		flib=new FileLib();

		System.out.println("yooo");
		creNca=new CreateNewCampaign(driver);
		creNca.clickNewCampaign();

		ccP=new CreateCampaignPage(driver);
		ccP.setCampaignName(flib.getCellData(EXCEL_PATH, "campaignpage", 1, 0));

		//		String cellValue = flib.getCellData(EXCEL_PATH, "campaignpage", 1, 1);
		//		ccP.setCalender(cellValue);
		//		String calValue = flib.getCellData(EXCEL_PATH, "campaignpage", 1, 2);

		String ErValue = flib.getCellData(EXCEL_PATH, "campaignpage", 1, 3);
		ccP.setExpectedRevenue(ErValue);

		String AcValue = flib.getCellData(EXCEL_PATH, "campaignpage", 1, 4);
		ccP.setActCost(AcValue);

		String NumSent = flib.getCellData(EXCEL_PATH, "campaignpage", 1, 5);
		ccP.setNumSent(NumSent);

		WebElement AdvVal = ccP.getAdvtersmtDd();
		Select sel = new Select(AdvVal);
		Thread.sleep(3000);
		sel.selectByVisibleText("Advertisement");
		Thread.sleep(2000);
		WebElement ststusVal = ccP.getStatus();
		Select seli = new Select(ststusVal);
		Thread.sleep(2000);
		seli.selectByIndex(1);

		String BgdtValue = flib.getCellData(EXCEL_PATH, "campaignpage", 1, 6);
		ccP.setBudgetedCost(BgdtValue);

		String ErResponse = flib.getCellData(EXCEL_PATH, "campaignpage", 1, 7);
		//WebElement expected = ccP.getExpectedResponse();
    	ccP.setExpectedResponse(ErResponse);
//		String cellValue = flib.getCellData(EXCEL_PATH, "campaignpage", 1, 1);
//		ccP.setCalender(cellValue);

//		String CampTitle = flib.getCellData(EXCEL_PATH, "Sheet3", 1, 7);
//		wcbl.waitForPageLoad(CampTitle);
//		String endDate = flib.getCellData(EXCEL_PATH, "campaignpage", 1, 8);
//		ccP.setEndDate(endDate);
		ccP.setSaveButtonElement();

	}
}
