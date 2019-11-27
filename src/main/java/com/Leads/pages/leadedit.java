package com.Leads.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class leadedit {
	
	private WebElement edit;

	public WebElement getEdit() {
		return edit;
	}

	public void clickedit() {
		edit.click();
	}
	public leadedit(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
