package com.Leads.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLead 
{

		@FindBy(xpath="//input[@name='property(Company)']") private WebElement compname;
	public WebElement getcompname()
	{
		return compname;
		  
	}
	public void setcompname(String Company) 
	{
		compname.sendKeys(Company);
	}
	@FindBy(xpath="//input[@name='property(Last Name)']") private WebElement lastname;
	public WebElement getlastname()
	{
		return lastname;
		  
	}
	public void lastname(String LName) 
	{
		lastname.sendKeys(LName);
	}
	@FindBy(xpath="(//input[@value='Save'])[1]") private WebElement savebtn;
	public WebElement getsavebtn()
	{
		return savebtn;
		  
	}
	public void savebtn() 
	{
		savebtn.click();
	}
	
	
	
	
	public CreateLead(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	

}
