package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(id="logoutLink") private WebElement logoutLink;
	public WebElement getlogoutLink()
	{
		return logoutLink;
		
	}
	
	public void clicklogoutLink()
	{
		logoutLink.click();
	}
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
