package com.CRM.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SalesOrderModule {

	@FindBy(xpath="//a[.='Sales Orders']") private WebElement salesModu;

	public WebElement getSalesModu() {
		return salesModu;
	}

	public void clickSalesModu() {
		salesModu.click();
	}
	
	@FindBy(xpath="//input[@value='New Sales Order']") private WebElement newSo;
	
	public WebElement getNewSo() {
		return newSo;
	}

	public void clickNewSo() {
		newSo.click();
	}
		
	@FindBy(name="property(Subject)") private WebElement subTB;

	public WebElement getSubTB() {
		return subTB;
	}

	public void setSubTB(String name) {
		subTB.sendKeys(name);
	}
	
	@FindBy(name="property(Customer No)") private WebElement custTB;
	
	public WebElement getCustTB() {
		return custTB;
	}

	public void setCustTB(String custno) { 
		custTB.sendKeys(custno);
	}
	
	@FindBy(xpath="//img[@title='Quote Lookup']") private WebElement qutTB;
	
	public WebElement getQutTB() {
		return qutTB;
	}

	public void clickQutTB() {
		qutTB.click();
	}
	
	@FindBy(name="property(Carrier)") private WebElement CarrDD;
	
	public WebElement getCarrDD() {
		return CarrDD;
	}

	public void clickCarrDD() {
		CarrDD.click();
	}
	
	@FindBy(name="property(Sales Commission)") private WebElement salecmn;

	public WebElement getSalecmn() {
		return salecmn;
	}

	public void setSalecmn(String sc) {
		salecmn.sendKeys(sc);
	}
	
	
	@FindBy(xpath="//img[@title='Account Name Lookup']") private WebElement accLookup;
	public WebElement getAccLookup() 
	{
		return accLookup;
	}
	public void clickAccLookup() 
	{
		accLookup.click();
	}
	
	@FindBy(xpath="//a[.='Next']") private WebElement clkNext;
	public WebElement getClkNext() 
	{
		return clkNext;
	}
	public void clickClkNext() 
	{
		clkNext.click();
	}
	
	@FindBy(xpath="//a[@class='link']") private List<WebElement> qutList;
	public List<WebElement> getqutList() 
	{
		return qutList;
	}
	
	public void clickqutList() 
	{
		for(WebElement oneQut:qutList)
		{
			if(oneQut.equals("Hp laptop"))
			{
				oneQut.click();
				clkNext.click();
				break;
			}
		}
	}


	@FindBy(xpath="//a[@class='link']") private List<WebElement> accList;
	public List<WebElement> getAccList() 
	{
		return accList;
	}
	
	public void clickAccList() 
	{
		for(WebElement oneAcc:accList)
		{
			if(oneAcc.equals("Jack"))
			{
				oneAcc.click();
				clkNext.click();
				break;
			}
		}
	}
	
	@FindBy(name="Button") private WebElement save;
	
	public WebElement getSave() {
		return save;
	}

	public void clickSave() {
		save.click();
	}

//	@FindBy(xpath="//img[@title='Calendar']") private WebElement Caldr;
//
//	public WebElement getCaldr() {
//		return Caldr;
//	}
//
//	public void clickCaldr() {
//		Caldr.click();
//	}

	
	public SalesOrderModule(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
