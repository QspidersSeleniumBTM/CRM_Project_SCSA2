package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage
{
	
  @FindBy(xpath="//a[.='Leads']") private WebElement leadsmod;
  public WebElement getleadsmod()
  {
	  return leadsmod;
  }
  public void leadsmod() 
  {
	  leadsmod.click();
  }
  
  public LeadsPage(WebDriver driver) 
  {
	PageFactory.initElements(driver, this);
  }
}