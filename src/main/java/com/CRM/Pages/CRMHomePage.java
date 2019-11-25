package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMHomePage {
	
	@FindBy(xpath = "//a[@href='/crm/logout.sas']")
	private WebElement logOutLink;
	
	

	public WebElement getLogOutLink() {
		return logOutLink;
	}

	public void clickLogOutLink() {
		logOutLink.click();
	}

	public CRMHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	

}
