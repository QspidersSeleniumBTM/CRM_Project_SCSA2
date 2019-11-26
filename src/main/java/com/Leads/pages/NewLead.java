package com.Leads.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewLead
{
	
  @FindBy(xpath="//input[@value='New Lead']") private WebElement Nleads;
  public WebElement getNleads()
  {
	return Nleads;
	  
  }
  public void clickNleads() 
  {
	  Nleads.click();
  }
  
  
  public NewLead(WebDriver driver) 
  {
	PageFactory.initElements(driver, this);
  }
}