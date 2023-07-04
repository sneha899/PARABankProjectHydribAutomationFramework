package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistration extends BaseClass{

	@Test
	public void Account_register()throws InterruptedException
	{
		logger.debug("application is started");
		logger.info("******Starting TC_001_AccountRegistration******* ");
		
		try
		{
			
	    HomePage hp=new HomePage(driver);
	   
		hp.clickOnAccountRegistration();
		
		logger.info("***clicked on register link***");
		//hp.clickOnMyAccount();
		
		
		AccountRegistrationPage regAccount=new AccountRegistrationPage(driver);
		
		logger.info("provinding customer data");
		
		regAccount.setFirstName(randomeString().toUpperCase());
		regAccount.setLastName(randomeString().toUpperCase());
		regAccount.setAddress(randomeString());
		regAccount.setCity(randomeString().toUpperCase());
		regAccount.setState(randomeString());
		regAccount.setZipcode(randomeNumber());
		regAccount.setTelephone(randomeNumber());
		regAccount.setSSN(randomeNumber());
		regAccount.setUsername(randomeString());
		//regAccount.setEmail(randomeString()+"@gmail.com");
		String password=randomAlphaNumeric();
		regAccount.setPassword(password);
		regAccount.setConfirmPassword(password);;
		regAccount.ClickContinue();
		
		String confmsg=regAccount.getConfirmationMsg();
	
		
		
		Assert.assertEquals(confmsg,"Your account was created successfully. You are now logged in.");
		}
		catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
		
	}
}
