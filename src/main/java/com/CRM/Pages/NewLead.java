package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewLead
{
	
  @FindBy(xpath="//input[@value='New Lead']") private WebElement newleadsbtn;
  public WebElement getnewleadsbtn()
  {
	return newleadsbtn;
	  
  }
  public void clicknewleadsbtn() 
  {
	  newleadsbtn.click();
  }
  
  
  public NewLead(WebDriver driver) 
  {
	PageFactory.initElements(driver, this);
  }
}