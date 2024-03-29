package com.CRM.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.genericLib.FileLib ;
import com.CRM.genericLib.IAutoConsts;

public class CloneContactPage implements IAutoConsts
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
	
	@FindBy(xpath="(//input[@name='Clone2'])[1]") private WebElement clnbtn;
	public WebElement getClnbtn() 
	{
		return clnbtn;
	}
	public void clickClnbtn() 
	{
		clnbtn.click();
	}
	
	@FindBy(xpath="(//input[@name='Button'])[1]") private WebElement savebtn;
	public WebElement getSavebtn() 
	{
		return savebtn;
	}
	public void clickSavebtn() 
	{
		savebtn.click();
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
				clickClnbtn();
				clickSavebtn();
				break;
			}
		}
	}
	
	@FindBy(xpath="//table[4]//tr[2]//td[4]") private WebElement verifyCC;
	public WebElement getVerifyCC() 
	{
		return verifyCC;
	}
	public String setVerifyCC() 
	{
		return verifyCC.getText();
	}
	
	public CloneContactPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
