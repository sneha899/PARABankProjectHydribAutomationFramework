package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utilities.DataProviders;
import testBase.BaseClass;

public class TC_03_LoginDDT extends BaseClass {

	
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void LoginDataDriven(String username, String pwd, String exp)
	{

		try {
			
		
		logger.info("************Starting test case of Tc_002_Test************");
		
		

		LoginPage lp=new LoginPage(driver);
		lp.Username(username);//valid username getting from config properties file
		lp.Password(pwd);
		lp.Login();
		
		
		logger.info("********Account overview page************");
		
		MyAccountPage Macc=new MyAccountPage(driver);
		boolean targetPage=Macc.AccoutPageExists();
		Assert.assertEquals(targetPage, true,"Invalid Login data");
		
		
		if (exp.equals("Valid")) {
			if (targetPage == true) {
				Macc.ClickLogout();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		}

		if (exp.equals("Invalid")) {
			if (targetPage == true) {
				MyAccountPage myaccpage = new MyAccountPage(driver);
				myaccpage.ClickLogout();
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);
			}
		}

	}
		
		catch(Exception e)
		{
			Assert.fail();
		}
		
		
		
		
		
		logger.info("********Finised login test***********");
	}
	
	}

