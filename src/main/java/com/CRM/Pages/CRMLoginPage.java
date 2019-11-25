package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CRMLoginPage {

	
	@FindBy(id="username") private WebElement untb;
	public WebElement getUntb(){
		return untb;
	}
	
	public void setUntb(String un)
	{
		untb.sendKeys(un);
	}
	
	
	@FindBy(name="pwd") private WebElement pwtb;
	public WebElement getPwtb() {
		return pwtb;
	}

	public void setPwtb(String pwd) {
		pwtb.sendKeys(pwd);
	}
	
	@FindBy(xpath="//div[.='Login ']") private WebElement loginBtn;
	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	@FindBy(xpath="(//span[@class='errormsg'])[1]") private WebElement errMsg;
	public WebElement getErrMsg() {
		return errMsg;
	}

	public String setErrMsg() {
		return errMsg.getText();
	}
	
	
	public void login(String un, String pwd) throws Throwable
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pwd);
		loginBtn.click();
		Thread.sleep(3000);
	}
	
	
	
	
	public CRMLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
}
