package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {
	@FindBy(xpath="//input[@name='property(Campaign Name)']") private WebElement campaignNametb;

	public WebElement getcampaignNametb() {
		return campaignNametb;
	}

	public void setCampaignNametb(String campaignName) {
		campaignNametb.sendKeys(campaignName);
	}
	
	@FindBy(xpath="//input[@name='property(Start Date)']") private WebElement startDatetb;

	public WebElement getstartDatetb() {
		return startDatetb;
	}

	public void setstartDatetb(String startdate) {
		startDatetb.sendKeys(startdate);;
	}
	
	@FindBy(xpath="//input[@name='property(Expected Revenue)']") private WebElement expectedrevenuetb;

	public WebElement getExpectedrevenuetb() {
		return expectedrevenuetb;
	}

	public void setExpectedrevenuetb(String expectedrevenue) {
		expectedrevenuetb.sendKeys(expectedrevenue);;
	}
	
	@FindBy(xpath="//input[@name='property(Actual Cost)']") private WebElement actualCosttb;

	public WebElement getactualCosttb() {
		return actualCosttb;
	}

	public void setactualCosttb(String actualCost) {
		actualCosttb.sendKeys(actualCost);;
	}
	
	@FindBy(xpath="//input[@name='property(Num sent)']") private WebElement numsenttb;

	public WebElement getNumsenttb() {
		return numsenttb;
	}
	public void setNumsenttb(String numsent) {
		numsenttb.sendKeys(numsent);;
	}
	
	
	
	@FindBy(xpath="//input[@name='property(End Date)']") private WebElement endDatetbtb;

	public WebElement getEndDatetbtb() {
		return endDatetbtb;
	}

	public void setEndDatetbtb(String endtdate) {
		endDatetbtb.sendKeys(endtdate);;
	}
	
	
	@FindBy(xpath="//input[@name='property(Budgeted Cost)']") private WebElement budgetedCosttb;

	public WebElement getBudgetedCosttb() {
		return budgetedCosttb;
	}

	public void setBudgetedCosttb(String budgetedCost) {
		budgetedCosttb.sendKeys(budgetedCost);;
	}
	
	@FindBy(xpath="//input[@name='property(Expected Response)']") private WebElement ExpectedResponsetb;

	public WebElement getExpectedResponsetb() {
		return ExpectedResponsetb;
	}

	public void setExpectedResponsetb(String ExpectedResponse) {
		ExpectedResponsetb.sendKeys(ExpectedResponse);
		
		
	}
	
	
	@FindBy(xpath="//textarea[@name='property(Description)']") private WebElement descriptionta;

	public WebElement getdescriptionta() {
		return descriptionta;
	}

	public void setdescriptionta(String description) {
		descriptionta.sendKeys(description);
		
		
	}
	
	@FindBy(xpath="//input[@value='Save']") private WebElement savebtn;

	public WebElement getSavebtn() {
		return savebtn;
	}

	public void clickSavebtn() {
		savebtn.click();
		
		
	}
	
	public void createCustomer(String campaignName,String startdate,String expectedrevenue,
			String actualCost,String numsent,String endtdate,String budgetedCost, 
			String ExpectedResponse, String description) throws Throwable {
		campaignNametb.sendKeys(campaignName);
		Thread.sleep(2000);
		startDatetb.sendKeys(startdate);;
		Thread.sleep(2000);
		expectedrevenuetb.sendKeys(expectedrevenue);;
		Thread.sleep(2000);
		actualCosttb.sendKeys(actualCost);;
		Thread.sleep(2000);
		numsenttb.sendKeys(numsent);;
		Thread.sleep(2000);
		endDatetbtb.sendKeys(endtdate);;
		Thread.sleep(2000);
		budgetedCosttb.sendKeys(budgetedCost);;
		Thread.sleep(2000);
		ExpectedResponsetb.sendKeys(ExpectedResponse);
		Thread.sleep(2000);
		descriptionta.sendKeys(description);
		Thread.sleep(2000);
		savebtn.click();
		Thread.sleep(2000);

	}
	
	@FindBy(xpath="(//img[@title='Calendar'])[1]") private WebElement startDateIcon;

	public WebElement getstartDateIcon() {
		return startDateIcon;
	}

	public void setstartDateIcon() {
		startDateIcon.click();;
	}
	
	@FindBy(xpath="//a[.='›']") private WebElement startDateIconForwardArrow;

	public WebElement getstartDateIconForwardArrow() {
		return startDateIconForwardArrow;
	}

	public void setstartDateIconForwardArrow() {
		startDateIconForwardArrow.click();;
	}
	
	
	@FindBy(xpath="//a[.='4']") private WebElement startDateIconDate;

	public WebElement getstartDateIconDate() {
		return startDateIconDate;
	}

	public void setstartDateIconDate() {
		startDateIconDate.click();;
	}
	
	
	
	public CreateCampaignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
