package com.CRM.Pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.genericLib.BaseTest;
import com.CRM.genericLib.FileLib;
import com.CRM.genericLib.IAutoConsts;


public class DeleteContact extends BaseTest implements IAutoConsts
{
	
	@FindBy(xpath="(//a[@class='menuOff'])[3]") private WebElement contMod;
	public WebElement getContMod() 
	{
		return contMod;
	}
	public void clickContMod() 
	{
		contMod.click();
	}
	
	@FindBy(xpath="(//input[@name='Delete2'])[1]") private WebElement dltBtn;
	public WebElement getDltBtn() 
	{
		return dltBtn;
	}
	public void clickDltBtn() throws Throwable 
	{
		dltBtn.click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(2000);
		al.accept();
	}
	
	@FindBy(xpath="//table[2]//td[3]//a") private List<WebElement> contList;
	public List<WebElement> getContList() 
	{
		return contList;
	}
	public void clickContList() throws Throwable 
	{
		for(WebElement oneCont:contList)
		{
			FileLib flib=new FileLib();
			if(oneCont.getText().equalsIgnoreCase(flib.getCellData(EXCEL_PATH, "Invalid", 1, 6)))
			{
				oneCont.click();
				clickDltBtn();
				break;
			}
		}
	}
	
	public DeleteContact(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
