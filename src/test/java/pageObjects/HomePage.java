package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}

	//Elements
	//a[@aria-expanded='false']/span
	
	//@FindBy(xpath = "//span[text()='My Account']")
	//WebElement lnkMyAccount;
	
	@FindBy(xpath = "//a[normalize-space()='Register']")
	WebElement lnkRegister;
	
	//ActionMethods
	
	/*public void clickOnMyAccount()
	{
		//lnkMyAccount.click();
		lnkMyAccount.sendKeys(Keys.ENTER);
	}*/
	
	
	public void clickOnAccountRegistration()
	{
		//lnkRegister.click();
		
		lnkRegister.sendKeys(Keys.ENTER);
	}
	
}
