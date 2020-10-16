package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase {
	
	HomePage homeObject ;
	LoginPage loginObject;
	
	
	@Test(priority=1)
	public void LoginSuccssfully() 
	{
		homeObject = new HomePage(driver); 
		homeObject.openLoginPage();
		loginObject = new LoginPage(driver);
		loginObject.openLoginPage("eng_saraghareb87@hotmail.com", "Queen@123");
		Assert.assertTrue(loginObject.userlbl.getText().contains("sara ghareb"));
		 
	}
}
