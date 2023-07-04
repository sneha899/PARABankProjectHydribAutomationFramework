package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);	
		
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement txtusername;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement txtpassword;
	
	@FindBy(xpath = "//input[@value='Log In']")
	WebElement btnLogin;
	
	
	public void Username(String name)
	{
		txtusername.sendKeys(name);;
	}
	
	public void Password(String pass) 
	{
		txtpassword.sendKeys(pass);;
	}
	
	public void Login()
	{
		btnLogin.click();
	}
}
