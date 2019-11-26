package com.CRM.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePotential 
{
	
	@FindBy(xpath="//a[.='Potentials']") private WebElement potMod;
	public WebElement getPotMod() {
		return potMod;
	}
	public void clickPotMod() {
		potMod.click();
	}
	
	@FindBy(xpath="//input[@value='New Potential']") private WebElement newPotBtn;
	public WebElement getNewPotBtn() {
		return newPotBtn;
	}
	public void clickNewPotBtn() {
		newPotBtn.click();
	}
	
	@FindBy(name="property(Potential Name)") private WebElement potNmTb;
	public WebElement getPotNmTb() {
		return potNmTb;
	}
	public void setPotNmTb(String pn) {
		potNmTb.sendKeys(pn);
	}
	
	@FindBy(xpath="//img[@title='Account Name Lookup']") private WebElement accLook;
	public WebElement getAccLook() {
		return accLook;
	}
	public void clickAccLook() {
		accLook.click();
	}
	
	@FindBy(xpath="//a[.='Next']") private WebElement nextBtn;
	public WebElement getNextBtn() {
		return nextBtn;
	}
	public void clickNextBtn() {
		nextBtn.click();
	}
	
	@FindBy(xpath="//a[@class='link']") private List<WebElement> accList;
	public List<WebElement> getAccList() {
		return accList;
	}
	public void clickAccList() {
		for(WebElement oneAcc:accList)
		{
			if(oneAcc.getText().equals("Jack"))
			{
				oneAcc.click();
				break;
			}
		}
	}
	
	@FindBy(xpath="//img[@title='Calendar']") private WebElement clsDate;
	public WebElement getClsDate() {
		return clsDate;
	}
	public void clickClsDate() {
		clsDate.click();
	}
	
	@FindBy(name="property(Stage)") private WebElement stageDD;
	public WebElement getStageDD() {
		return stageDD;
	}
	public void clickStageTb() {
		stageDD.click();
	}
	
	@FindBy(name="property(Type)") private WebElement typeDD;
	public WebElement getTypeDD() {
		return typeDD;
	}
	public void clickTypeDD() {
		typeDD.click();
	}
	
	@FindBy(name="property(Amount)") private WebElement amtTB;
	public WebElement getAmtTB() {
		return amtTB;
	}
	public void setAmtTB() {
		amtTB.sendKeys("25000");
	}
	
	@FindBy(name="property(Lead Source)") private WebElement leadDD;
	public WebElement getLeadDD() {
		return leadDD;
	}
	public void clickLeadDD() {
		leadDD.click();
	}
	
	@FindBy(xpath="(//input[@name='Button'])[1]") private WebElement saveBtn;
	public WebElement getSaveBtn()
	{
		return saveBtn;
	}
	public void clickSaveBtn()
	{
		saveBtn.click();
	}
	
	public CreatePotential(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
