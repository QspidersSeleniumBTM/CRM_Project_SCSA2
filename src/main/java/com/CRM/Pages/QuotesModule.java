package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class QuotesModule {
	
	
	@FindBy(xpath="//a[.='Quotes']")private WebElement qmod;
	public WebElement getQuote()
	{
		return qmod;
	}
	public void setQuote()
	{
		qmod.click();
	}
	public QuotesModule(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


}
