package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadDropdownPage 
{
	
	
	@FindBy(xpath="//a[.='Leads']") private WebElement lead;
	
	public WebElement getLead() {
		return lead;
	}

	public void clickLead() {
		lead.click();
	}

	
	@FindBy(xpath="(//input[@class='button'])[3]") private WebElement newLead;
	
	public WebElement getNewLead() {
		return newLead;
	}

	public void clickNewLead() {
		newLead.click();
	}
	
	@FindBy(name="property(First Name)") private WebElement firName;
	public WebElement getFirName() {
		return firName;
	}

	public void setFirName(String fn) {
		firName.sendKeys(fn);
	}
	
	@FindBy(name="property(Company)") private WebElement comp;
	public WebElement getComp() {
		return comp;
	}

	public void setComp(String cmp) {
		comp.sendKeys(cmp);
	}

	@FindBy(name="property(Last Name)") private WebElement lasName;
	public WebElement getLasName() {
		return lasName;
	}

	public void setLasName(String ln) {
		lasName.sendKeys(ln);
	}


	@FindBy(name="property(Designation)") private WebElement desg;
	public WebElement getDesg() {
		return desg;
	}

	public void setDesg(String dsg) {
		desg.sendKeys(dsg);
	}


	@FindBy(name="property(Phone)") private WebElement phon;
	public WebElement getPhon() {
		return phon;
	}

	public void setPhon(String ph) {
		phon.sendKeys(ph);
	}


	@FindBy(name="property(Mobile)") private WebElement mob;
	public WebElement getMob() {
		return mob;
	}

	public void setMob(String mb) {
		mob.sendKeys(mb);
	}
	
	@FindBy(name="property(Annual Revenue)") private WebElement annRev;
	public WebElement getAnnRev() {
		return annRev;
	}

	public void setAnnRev(String ar) {
		annRev.sendKeys(ar);
	}


	@FindBy(name="property(Campaign Source)") private WebElement camSource;
	public WebElement getCamSource() {
		return camSource;
	}

	public void setCamSource(String cs) {
		camSource.sendKeys(cs);
	}
	
	@FindBy(name="property(Email)") private WebElement email;
	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String em) {
		email.sendKeys(em);
	}
	
	@FindBy(name="property(Fax)") private WebElement fax;
	public WebElement getFax() {
		return fax;
	}

	public void setFax(String fx) {
		fax.sendKeys(fx);
	}
	
	@FindBy(name="property(Website)") private WebElement webst;
	public WebElement getWebst() {
		return webst;
	}

	public void setWebst(String websit) {
		webst.sendKeys(websit);
	}
	
	@FindBy(name="property(No of Employees)") private WebElement numOfEmp;

	public WebElement getNumOfEmp() {
		return numOfEmp;
	}

	public void setNumOfEmp(String nOfEmp) {
		numOfEmp.sendKeys(nOfEmp);;
	}
    
	@FindBy(xpath="//a[.='Next']") private WebElement clkNext;
	
	
	public WebElement getClkNext() {
		return clkNext;
	}

	public void clickClkNext() {
		clkNext.click();
	}


	@FindBy(xpath="//img[@title='Campaign Name Lookup']") private WebElement csLookup;
	public WebElement getCsLookup() {
		return csLookup;
	}

	public void clickCsLookup() {
		csLookup.click();
	}

	@FindBy(xpath="//a[@class='link']") private List<WebElement> camList;
	public List<WebElement> getCamList() {
		return camList;
	}

	public void clickCamList() {
		for(WebElement oneCam:camList)
		{
			if(oneCam.equals("iphone 7"))
			{
				oneCam.click();
				clkNext.click();
				break;
			}
		}
			
	}


	@FindBy(name="property(Street)") private WebElement strt;
	public WebElement getStrt() {
		return strt;
	}

	public void setStrt(String street) {
		strt.sendKeys(street);
	}
	
	@FindBy(name="property(City)") private WebElement cit;
	public WebElement getCit() {
		return cit;
	}

	public void setCit(String ct) {
		cit.sendKeys(ct);
	}
	
	@FindBy(name="property(State)") private WebElement stat;
	public WebElement getStat() {
		return stat;
	}

	public void setStat(String ste) {
		stat.sendKeys(ste);
	}
	
	@FindBy(name="property(Country)") private WebElement countr;
	public WebElement getCountr() {
		return countr;
	}

	public void setCountr(String ctry) {
		 countr.sendKeys(ctry);
	}
	
	@FindBy(name="property(Zip Code)") private WebElement zipCode;
	public WebElement getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zc) {
		zipCode.sendKeys(zc);
	}

	@FindBy(xpath="(//input[@class='button'])[5]") private WebElement save;
	public WebElement getSave() {
		return save;
	}

	public void clickSave() {
	   save.click();
	}
	
	@FindBy(name="property(saltName)") private WebElement nameTitleDD;
	
	public WebElement getNameTitleDD() {
		return nameTitleDD;
	}

	public void clickNameTitleDD() {
		nameTitleDD.click();
	}
	
	
	@FindBy(name="property(Lead Source)") private WebElement leadSrcDD;
	
	public WebElement getLeadSrcDD() {
		return leadSrcDD;
	}

	public void clickLeadSrcDD() {
		leadSrcDD.click();
	}

	
	@FindBy(name="property(Industry)") private WebElement industryDD;
	
	public WebElement getIndustryDD() {
		return industryDD;
	}

	public void clickIndustryDD() {
		industryDD.click();
	}
	
	@FindBy(name="property(Lead Status)") private WebElement leadStatusDD;
	
	public WebElement getLeadStatusDD() {
		return leadStatusDD;
	}

	public void clickLeadStatusDD() {
		leadStatusDD.click();
	}
	
	@FindBy(name="property(Rating)") private WebElement ratingDD;
	
	public WebElement getRatingDD() {
		return ratingDD;
	}

	public void clickRatingDD() {
		ratingDD.click();
	}
	
	
	
	public LeadDropdownPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[.='iphone 7']")private WebElement camp;
	public void clickCamp() {
		camp.click();
	}

}
