package testCase;

import testBase.BaseClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC_002_LoginTest extends BaseClass {

	@Test
	public void Test_Login()
	{
		try {
			
		
		logger.info("************Starting test case of Tc_002_Test************");
		
		

		LoginPage lp=new LoginPage(driver);
		lp.Username(rb.getString("Username"));//valid username getting from config properties file
		lp.Password(rb.getString("Password"));
		lp.Login();
		
		
		logger.info("********Account overview page************");
		
		MyAccountPage Macc=new MyAccountPage(driver);
		boolean targetPage=Macc.AccoutPageExists();
		Assert.assertEquals(targetPage, true,"Invalid Login data");
	}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("********Finised login test***********");
	}
	
	
	
	
}
