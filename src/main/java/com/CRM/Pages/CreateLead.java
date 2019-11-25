package com.crm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLead 
{

	@FindBy(xpath="//input[@name='property(First Name)']") private WebElement fname;
	public WebElement getfname()
	{
		return fname;
		  
	}
	public void fname() 
	{
		  fname.sendKeys("mohan");
	}
	@FindBy(xpath="//input[@name='property(Designation)']") private WebElement desgname;
	public WebElement getdesgname()
	{
		return desgname;
		  
	}
	public void desgname() 
	{
		  desgname.sendKeys("sales manager");
	}
	@FindBy(xpath="//input[@name='property(Company)']") private WebElement compname;
	public WebElement getcompname()
	{
		return compname;
		  
	}
	public void compname() 
	{
		compname.sendKeys("IBM");
	}
	@FindBy(xpath="//input[@name='property(Last Name)']") private WebElement lastname;
	public WebElement getlastname()
	{
		return lastname;
		  
	}
	public void lastname() 
	{
		lastname.sendKeys("srivastav");
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
