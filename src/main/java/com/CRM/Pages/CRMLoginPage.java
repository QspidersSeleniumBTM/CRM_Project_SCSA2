package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRMLoginPage 
{
	@FindBy(id="userName") private WebElement untb;
	public WebElement getUntb()
	{
		return untb;
	}
	public void setUntb(String un) 
	{
		untb.sendKeys(un);
	}
	
	@FindBy(id="passWord") private WebElement pwtb;
	public WebElement getPwtb() 
	{
		return pwtb;
	}
	public void setPwtb(String pwd) 
	{
		pwtb.sendKeys(pwd);
	}
	
	@FindBy(xpath="//input[@type='image']") private WebElement loginBtn;
	public WebElement getLoginBtn() 
	{
		return loginBtn;
	}
	public void setLoginBtn() 
	{
		loginBtn.click();
	}
	
	@FindBy(xpath="//td[@class='small mandatory']") private WebElement errorMsg;
	public WebElement getErrorMsg() 
	{
		return errorMsg;
	}
	public String setErrorMsg() 
	{
		return errorMsg.getText();
	}

	@FindBy(xpath="(//a[@class='topLink'])[6]") private WebElement logoutLink;
	public WebElement getLogoutLink() 
	{
		return logoutLink;
	}

	public void clickLogoutLink() 
	{
		logoutLink.click();
	}

	public void login(String un, String pwd) throws Throwable
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pwd);
		loginBtn.click();
		Thread.sleep(2000);
	}
	
	public CRMLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
