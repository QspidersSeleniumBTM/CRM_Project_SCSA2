package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_AllContacts {
	public Create_AllContacts(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@class='button'])[3]")private WebElement newContact;
	public void clickNewContact() {
		newContact.click();
	}

}
