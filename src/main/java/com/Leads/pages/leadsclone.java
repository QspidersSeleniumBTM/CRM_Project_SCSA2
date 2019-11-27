package com.Leads.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class leadsclone {
	
		@FindBy(xpath="(//input[@value='Clone'])[1]")private WebElement clone;
		public WebElement getclone()
		{
			return clone;
			
		}
	public void clickclone()
	{
		clone.click();
	}
	public leadsclone(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
