package com.Leads.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class leadlist {
	@FindBy(xpath="(//input[@class='link '])[1]]")
	private WebElement list;

	public WebElement getlist() {
		return list;
	}

	public void clicklist() {
		list.click();
	}

	public leadlist(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
