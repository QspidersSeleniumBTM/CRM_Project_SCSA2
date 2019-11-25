package com.zoho.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Contact_page {
public Create_Contact_page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[.='Contacts']")private WebElement contact;
public void clickContact() {
	contact.click();
}
@FindBy(name="property(First Name)") private WebElement FN;
public void setFN(String fn) {
	FN.sendKeys(fn);
}
@FindBy(name="property(Last Name)")private WebElement LN;
public void setLN(String ln) {
	LN.sendKeys(ln);
}
@FindBy(xpath="//img[@title='Account Name Lookup']")private WebElement accountNK;
public void clickANK() {
	accountNK.click();
}
@FindBy(xpath="//a[.='Next']")private WebElement next;
public void clickNext() {
	next.click();
}
@FindBy(xpath="//a[.='Vinod']")private WebElement acctName;
public void selectAccount() {
	acctName.click();
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
@FindBy(xpath="//td[.='Mailing to Other']")private WebElement copyAds;
public void selectMailingTO() {
	copyAds.click();
}
}
