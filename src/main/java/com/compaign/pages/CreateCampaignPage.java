package com.compaign.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.genericLib.BaseTest;

public class CreateCampaignPage extends BaseTest{

	@FindBy(xpath = "(//input[@class='textField'])[2]")     
	private	WebElement campaignName;

	public WebElement getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String cn) {
		campaignName.sendKeys(cn);
	}


	@FindBy(xpath = "(//img[@title='Calendar'])[1]")
	private WebElement calender;

	public WebElement getCalender() {
		return calender;
	}
	@FindBy(xpath="//a[.='24']")private WebElement datElement;
     

	public WebElement getDatElement() {
		return datElement;
	}

	public void setDatElement() {
		datElement.click();
	}

//	public void setCalender(String value) {
//		calender.click();
//		Set<String> allwhs=driver.getWindowHandles();
//		for(String wh:allwhs)
//		{
//			String title=driver.switchTo().window(wh).getTitle();
//			if(title.contains(value))
//			{
//				datElement.click(); 
//				//driver.close();
//			}
//		}
	

	//
	//	@FindBy(xpath="(//img[@title='Calculator'])[1]")
	//	private WebElement calci;
	//
	//	public WebElement getCalculator() {
	//		return calci;
	//	}
	//	@FindBy(name = "calc4")
	//   private	WebElement numFour;
	//
	//	public WebElement getNumFour() {
	//		return numFour;
	//	}
	//	public void clickNum() {
	//		for (int i = 0; i <5; i++) {
	//			numFour.click();
	//		}
	//	}
	public  CreateCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='property(Expected Revenue)']") private	WebElement ExpectedRevenue;

	public WebElement getExpectedRevenue() {
		return ExpectedRevenue;
	}

	public void setExpectedRevenue(String js) {
		ExpectedRevenue.sendKeys(js);
	}
	@FindBy(xpath = "//input[@name='property(Actual Cost)']")
	private	WebElement ActCost;

	public WebElement getActCost() {
		return ActCost;
	}

	public void setActCost(String kf) {
		ActCost.sendKeys(kf);
	}

	@FindBy(xpath="//input[@name='property(Num sent)']")
	private	WebElement NumSent;

	public WebElement getNumSent() {
		return NumSent;
	}

	public void setNumSent(String se) {
		NumSent.sendKeys(se);
	}


	@FindBy(xpath = "//select[@name='property(Type)']")
	private WebElement	AdvtersmtDd;

	public WebElement getAdvtersmtDd() {
		return AdvtersmtDd;
	}

	@FindBy(xpath = "//select[@name='property(Status)']")
	private	WebElement Status;

	public WebElement getStatus() {
		return Status;
	}
	@FindBy(xpath = "//input[@name='property(Budgeted Cost)']")
	private  WebElement BudgetedCost;

	
	public WebElement getBudgetedCost() {
		return BudgetedCost;
	}
   
	public void setBudgetedCost(String kh) {
		BudgetedCost.sendKeys(kh);
	}


	@FindBy(xpath = "//input[@name='property(Expected Response)']")
	private WebElement ExpectedResponse;

	
	
	public WebElement getExpectedResponse() {
		return ExpectedResponse;
	}

	public void setExpectedResponse(String ds) {
		ExpectedResponse.sendKeys(ds);
	}

	@FindBy(xpath = "//input[@name='property(End Date)']")
     private WebElement endDate;

	public WebElement getEndDate() {
		return endDate;
	}

	public void setEndDate(String kk) {
		
		endDate.sendKeys(kk);
	}
	@FindBy(xpath="(//input[@value='Save' and @class='button' ])[2]")private WebElement saveButtonElement;

	public WebElement getSaveButtonElement() {
		return saveButtonElement;
	}

	public void setSaveButtonElement() {
		 saveButtonElement.click();
	}
	



}
