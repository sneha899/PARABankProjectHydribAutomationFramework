package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath = "//h1[normalize-space()='Accounts Overview']")
	WebElement accounts;
	
	
	@FindBy(xpath = "//a[normalize-space()='Log Out']")
	WebElement accountlogout;
	
	public boolean AccoutPageExists()
	{
		try
		{
			return(accounts.isDisplayed());
		}
		catch(Exception E)
		{
			return(false);	
		}
		
	
			
	}

	public void ClickLogout() {
		
		accountlogout.click();
		
	}
}
