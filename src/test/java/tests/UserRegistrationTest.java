package tests;



import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;


public class UserRegistrationTest extends TestBase
{
	HomePage homeObject ; 
	
	@Test(priority=1,alwaysRun=true)
	public void UserCanRegisterSuccssfully() 
	{
		homeObject = new HomePage(driver); 
		homeObject.openRegistrationPage();
		Assert.assertTrue(homeObject.Namelbl.getText().contains("اسم المستخدم"));
		 
	}
	
}
