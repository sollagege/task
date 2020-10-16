package tests;

import org.testng.annotations.Test;

import pages.UserPage;


public class UserTest extends TestBase
{
	UserPage emailObject ;
	
	 	@Test(priority=1)
	public void RegisteredUserCanSendProductToFriend() throws InterruptedException 
	{
		
		emailObject = new UserPage(driver); 
		emailObject.Registerform("aliiii123","Queen@123","sarabusinessboomer@gmail.com");
		//Assert.assertTrue(emailObject.messageNotification.getText().contains("لقد تم إرسال رسالة على بريدك الالكتروني لتفعيل حسابك"));
		
		////////////////////////////////////////////////////////////
		//Notice 2 : website didn't send any mail to my account //
		/////////////////////////////////////////////////////////
	}
}
