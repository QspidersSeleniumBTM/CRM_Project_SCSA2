package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloneCampaignPage 
{
	@FindBy (xpath = "(//input[@value='Save'])[1]") private WebElement savebtn;
	public WebElement getSavebtn() {
		return savebtn;
	}

	public void clickSavebtn() {
		savebtn.click();;
	}
	
	
	public CloneCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
