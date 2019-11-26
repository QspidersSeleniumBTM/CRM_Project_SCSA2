package com.CRM.Pricebook;

import org.testng.annotations.Test;

import com.CRM.Pages.CreatePricebookPage;
import com.CRM.Pages.Create_Contact_page;
import com.CRM.genericLib.BaseTest;
import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.WebdriverCommonLib;

public class Create_Pricebook extends BaseTest {
	
	WebdriverCommonLib wcl;
	Create_Contact_page ccp;
	CreatePricebookPage cpb;
	FileLib flib = new FileLib();
	@Test
	public void createPriceBook() {
		cpb= new CreatePricebookPage(driver);
		for(int i=0;i<15;i++) {
			cpb.clickSB();
		}
		cpb.clickPotential();
	}

}
