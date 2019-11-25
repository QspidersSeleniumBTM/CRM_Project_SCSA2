package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignDetailsPage {
	@FindBy (xpath = "(//input[@value='Edit'])[1]") private WebElement editbtn;
	public WebElement getEditbtn() {
		return editbtn;
	}

	public void clickEditbtn() {
		editbtn.click();;
	}
	
	@FindBy (xpath = "(//input[@value='Clone'])[1]") private WebElement clonebtn;
	public WebElement getClonebtn() {
		return clonebtn;
	}

	public void clickClonebtn() {
		clonebtn.click();;
	}
	
	@FindBy (xpath = "(//input[@value='Delete'])[1]") private WebElement deletebtn;
	public WebElement getDeletebtn() {
		return deletebtn;
	}

	public void clickDeletebtn() {
		deletebtn.click();;
	}
	
	@FindBy (xpath = "//input[@value='New Task']") private WebElement newtaskbtn;
	public WebElement getnewtaskbtn() {
		return newtaskbtn;
	}

	public void clicknewtaskbtn() {
		newtaskbtn.click();;
	}
	
	
	@FindBy (xpath = "//input[@value='New Event']") private WebElement neweventbtn;
	public WebElement getNewEventbtn() {
		return neweventbtn;
	}

	public void clickNewEventbtn() {
		neweventbtn.click();;
	}
	public CampaignDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
