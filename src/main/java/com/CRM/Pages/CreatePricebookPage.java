package com.CRM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePricebookPage {
	public CreatePricebookPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	@FindBy(id="scrollright") private WebElement sideBar;
	public void clickSB() {
		sideBar.click();
	}
	@FindBy(xpath="//a[.='Price Books']")private WebElement potential;
	public void clickPotential() {
		potential.click();
	}

}
