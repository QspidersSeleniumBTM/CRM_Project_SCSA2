package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
	
public class NewPotential {
	
	@FindBy(xpath="//input[@value='New Potential']")private WebElement newpoten;
	public WebElement getNewPot()
	{
		return newpoten;
	}
	public void setNewPot()
	{
		newpoten.click();
	}
	public NewPotential(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
}


