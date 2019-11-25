package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	
	@FindBy(id = "userName")
	private WebElement lntb;

	public WebElement getLntb() {
		
		return lntb;
	}

	public void setLntb(String name) {
		lntb.sendKeys(name);
	}
	
	@FindBy(name = "j_password")
	private WebElement pwtb;

	public WebElement getPwtb() {
		return pwtb;
	}

	public void setPwtb(String pw) {
		pwtb.sendKeys(pw);
	}
	
	@FindBy(xpath = "//input[@title='Sign In']")
	private WebElement signIn;

	public WebElement getSignIn() {
		return signIn;
	}

	public void setSignIn() {
		signIn.click();
	}
	
	@FindBy(xpath = "//input[@title='Sign In']")
	private WebElement errormsg;
	
	public WebElement getErrormsg() {
		return errormsg;
	}

	public String clickErrormsg() {
		return errormsg.getText();
	}
	
	
	public void signIn(String name,String pw) throws Throwable {
		lntb.sendKeys(name);
		pwtb.sendKeys(pw);
		signIn.click();
		Thread.sleep(2000);
	}

	public Signin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


}
