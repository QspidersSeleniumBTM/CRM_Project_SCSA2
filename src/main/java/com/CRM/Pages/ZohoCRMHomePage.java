package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZohoCRMHomePage {
@FindBy(xpath="//a[.='Logout [rashmi@dell.com]']") private WebElement logoutbtn;

public WebElement getLogoutbtn() {
	return logoutbtn;
}

public void clickLogoutbtn() {
	logoutbtn.click();
}


@FindBy (xpath = "//a[.='Leads']") private WebElement leadslink;
public WebElement getLeadslink() {
	return leadslink;
}

public void clickLeadslink() {
	leadslink.click();;
}



@FindBy (xpath = "//a[.='Campaigns']") private WebElement Campaignlink;
public WebElement getCampaignlink() {
	return Campaignlink;
}

public void clickCampaignlink() {
	Campaignlink.click();;
}

@FindBy (xpath = "//a[.='Contacts']") private WebElement contactslink;
public WebElement getContactslink() {
	return contactslink;
}

public void clickContactslink() {
	contactslink.click();;
}

@FindBy (xpath = "//a[.='Accounts']") private WebElement accountslink;
public WebElement getAccountslink() {
	return accountslink;
}

public void clickAccountslink() {
	accountslink.click();;
}



@FindBy (xpath = "//a[.='Potentials']") private WebElement potentialslink;
public WebElement getPotentialslink() {
	return potentialslink;
}

public void clickPotentialslink() {
	potentialslink.click();;
}

@FindBy (xpath = "//a[.='Products']") private WebElement productslink;
public WebElement getProductslink() {
	return productslink;
}

public void clickProductslink() {
	productslink.click();;
}


public ZohoCRMHomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
}
