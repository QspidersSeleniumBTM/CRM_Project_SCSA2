package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campaign 
{
	@FindBy(xpath="//a[.='Campaigns']") private WebElement cmapaignbtn;
	public WebElement getCmapaignbtn() {
		return cmapaignbtn;
	}
	public void clickCmapaignbtn() {
		cmapaignbtn.click();
	}
	@FindBy(xpath="//input[@value='New Campaign']") private WebElement newCampaignbtn;
	public WebElement getNewCampaignbtn() {
		return newCampaignbtn;
	}
	public void clickNewCampaignbtn() {
		newCampaignbtn.click();
	}
	@FindBy(name="property(Campaign Name)") private WebElement campName;
	public WebElement getCampName() {
		return campName;
	}
	public void setCampName(String cn) {
		campName.sendKeys(cn);
	}
		
	@FindBy(name="Button") private WebElement savebtn;	
	
	public WebElement getSavebtn() {
		return savebtn;
	}
	public void clickSavebtn() {
		savebtn.click();
	}
	@FindBy(name="edit2") private WebElement edit;
	public WebElement getstartDate() {
		return edit;
	}
	public void clickedit() {
		edit.click();;
	}
	@FindBy(name="property(Expected Revenue)") private WebElement expRevenue;
	public WebElement getexpRevenue() {
		return expRevenue;
	}
	public void setexpRevenue(String er) {
		expRevenue.sendKeys(er);
	}
	@FindBy(name="Clone2") private WebElement clone;
	public WebElement getclone() {
		return clone;
	}
	public void clickclone() {
		clone.click();
	}
	
	
	public Campaign(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void campaign(String cn) throws Throwable
	{
		cmapaignbtn.click();
		Thread.sleep(4000);
		newCampaignbtn.click();
		Thread.sleep(3000);
		campName.sendKeys(cn);
		Thread.sleep(3000);
		savebtn.click();		
	}
}

