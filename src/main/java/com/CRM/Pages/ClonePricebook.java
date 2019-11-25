package com.CRM.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.IAutoConsts;

public class ClonePricebook implements IAutoConsts
{
	@FindBy(xpath="(//a[@class='menuOff'])[14]") private WebElement prcbookmod;
	public WebElement getPrcbookmod() 
	{
		return prcbookmod;
	}
	public void clickPrcbookmod() 
	{
		prcbookmod.click();
	}
	
	@FindBy(xpath="//table[2]//td[3]//a") private List<WebElement> pbList;
	public List<WebElement> getPbList() 
	{
		return pbList;
	}
	public void clickPbList() throws Throwable 
	{
		for(WebElement onePb:pbList)
		{
			FileLib flib=new FileLib();
			if(onePb.getText().equalsIgnoreCase(flib.getCellData(EXCEL_PATH, "Invalid", 1, 10)))
			{
				onePb.click();
				clickClkClone();
				clickClkSave();
				break;
			}
		}
	}
	
	@FindBy(xpath="(//input[@name='Clone2'])[1]") private WebElement clkClone;
	public WebElement getClkClone() 
	{
		return clkClone;
	}
	public void clickClkClone() 
	{
		clkClone.click();
	}
	
	@FindBy(xpath="(//input[@name='Button'])[1]") private WebElement clkSave;
	public WebElement getClkSave() 
	{
		return clkSave;
	}
	public void clickClkSave() 
	{
		clkSave.click();
	}
	
	public ClonePricebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
