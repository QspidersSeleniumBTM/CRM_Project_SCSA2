package com.CRM.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZohoCRMDisplayingCustomViewDetailsPage {
	@FindBy (xpath = "//input[@value='New Campaign']") private WebElement NewCampaignbtn;
	public WebElement getNewCampaignbtn() {
		return NewCampaignbtn;
	}

	public void clickNewCampaignbtn() {
		NewCampaignbtn.click();;
	}
	
	@FindBy (xpath = "(//a[.='dell'])[2]") private WebElement dellCampaignlink;
	public WebElement getDellCampaignlink() {
		return dellCampaignlink;
	}

	public void clickDellCampaignlink() {
		dellCampaignlink.click();;
	}
	
	@FindBy (xpath = "//input[@value='3']") private WebElement campaigncheckbox;
	public WebElement getcampaigncheckbox() {
		return campaigncheckbox;
	}

	public void clickcampaigncheckbox() {
		campaigncheckbox.click();;
	}
	
	@FindBy (xpath = "//input[@value='Create Task']") private WebElement createtaskbtn;
	public WebElement getcreatetaskbtn() {
		return createtaskbtn;
	}

	public void clickcreatetaskbtn() {
		createtaskbtn.click();;
	}
	
	@FindBy (xpath="//table[@class='secContent']//tr[*]//td[3]") private List<WebElement> campaignList;
	public List<WebElement> getCampaignList() {
		return campaignList;
		
	}
	
	
	
	
	public ZohoCRMDisplayingCustomViewDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
