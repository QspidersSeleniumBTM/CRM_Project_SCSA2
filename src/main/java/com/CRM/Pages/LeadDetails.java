package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LeadDetails 
{

	public LeadDetails(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

}
