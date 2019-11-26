package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Contact {
public Create_Contact(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[.='Contacts']")private WebElement contact;
public void clickContact() {
	contact.click();
}
@FindBy(name="property(Last Name)")private WebElement LN;
public void setLN(String ln) {
	LN.sendKeys(ln);
}
@FindBy(name="property(Mailing Street)")private WebElement mailingS;
public void setMS(String ms) {
	mailingS.sendKeys(ms);
}
@FindBy(name="copyAddress")private WebElement copyads;
public void clickCopyAds() {
	copyads.click();
}
public WebElement getCopyAds() {
	return copyads;
}
@FindBy(xpath="(//input[@class='button'])[2]")private WebElement save;
public void clickSave() {
	save.click();
}
}
