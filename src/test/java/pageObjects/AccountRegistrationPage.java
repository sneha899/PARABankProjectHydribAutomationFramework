package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(name = "customer.firstName")
	WebElement txtFirstName;
	
	
	@FindBy(name = "customer.lastName")
	WebElement txtLastName;
	
	@FindBy(name = "customer.address.street")
    WebElement txtAddress;
	
	@FindBy(name = "customer.address.city")
    WebElement txtCity;
	

	@FindBy(name = "customer.address.state")
    WebElement txtState;
	
	@FindBy(name = "customer.address.zipCode")
    WebElement txtZipcode;
	
	
	@FindBy(name = "customer.phoneNumber")
	WebElement txtTelephone;
	
	

	@FindBy(name = "customer.ssn")
	WebElement txtSSN;
	

	@FindBy(name = "customer.username")
	WebElement txtUserName;
	
	@FindBy(name = "customer.password")
	WebElement txtPassword;

	@FindBy(name = "repeatedPassword")
	WebElement txtConfirmPassword;
	
	
	
	@FindBy(xpath="//input[@value='Register']")
	WebElement btnContinue;
	
	@FindBy(xpath="//p[contains(text(),'Your account was created successfully. You are now')]")
	WebElement msgConfirmation;
	
	public void setFirstName(String Firstname)
	{
		txtFirstName.sendKeys(Firstname);
	}
	public void setLastName(String lastname)
	{
		txtLastName.sendKeys(lastname);
	}
	public void setAddress(String address)
	{
		txtAddress.sendKeys(address);
	}
	
	public void setCity(String city)
	{
		txtCity.sendKeys(city);
	}
	
	
	public void setState(String State)
	{
		txtState.sendKeys(State);
	}
	
	public void setZipcode(String Zipcode) 
	{
		txtZipcode.sendKeys(Zipcode);
	}
	
	
	public void setTelephone(String tel) {
		txtTelephone.sendKeys(tel);

	}
	
	public void setSSN(String SSN)
	{
		txtSSN.sendKeys(SSN);
		
	}
	
	public void setUsername(String username)
	{
		txtUserName.sendKeys(username);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
		
		
	}
	public void setConfirmPassword(String pwd) {
		txtConfirmPassword.sendKeys(pwd);

	}

	
	
	public void ClickContinue() 
	{
		btnContinue.click();
		

		//sol2 
		//btnContinue.submit();
		
		//sol3
		//Actions act=new Actions(driver);
		//act.moveToElement(btnContinue).click().perform();
					
		//sol4
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();", btnContinue);
		
		//Sol 5
		//btnContinue.sendKeys(Keys.RETURN);
		
		//Sol6  
		//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
	}
	
	
	public String getConfirmationMsg()
	{
		try {
		return (msgConfirmation.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}
}
