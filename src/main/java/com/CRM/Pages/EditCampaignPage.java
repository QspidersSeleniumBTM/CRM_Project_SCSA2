package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCampaignPage {
	@FindBy (xpath = "//input[@name='property(Campaign Name)']") private WebElement campaignnametb;
	public WebElement getCampaignnametb() {
		return campaignnametb;
	}

	public void setCampaignnametb(String campaignname) {
		campaignnametb.sendKeys(campaignname);
	}
	
	@FindBy (xpath = "(//input[@value='Save'])[1]") private WebElement savebtn;
	public WebElement getSavebtn() {
		return savebtn;
	}

	public void clickSavebtn() {
		savebtn.click();;
	}
	
	
	public EditCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
