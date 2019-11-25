package contacts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericlib.FileLib;
import genericlib.IAutoConsts;

public class EditContact implements IAutoConsts 
{
	@FindBy(xpath="(//a[@class='menuOff'])[3]") private WebElement contMod;
	public WebElement getContMod() 
	{
		return contMod;
	}
	public void clickContMod() 
	{
		contMod.click();
	}
	
	@FindBy(xpath="(//input[@name='edit2'])[1]") private WebElement editBtn;
	public WebElement getEditBtn() 
	{
		return editBtn;
	}
	public void clickEditBtn() 
	{
		editBtn.click();
	}

	@FindBy(xpath="(//input[@name='Button'])[1]") private WebElement savebtn;
	public WebElement getSavebtn() 
	{
		return savebtn;
	}
	public void clickSavebtn() 
	{
		savebtn.click();
	}
	
	@FindBy(xpath="//table[2]//td[3]//a") private List<WebElement> contList;
	public List<WebElement> getContList() 
	{
		return contList;
	}
	public void clickContList() throws Throwable 
	{
		for(WebElement oneCont:contList)
		{
			FileLib flib=new FileLib();
			if(oneCont.getText().equalsIgnoreCase(flib.getCellData(EXCEL_PATH, "Invalid", 1, 6)))
			{
				oneCont.click();
				clickEditBtn();
				clickSavebtn();
				break;
			}
		}
	}
	
	public EditContact(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
