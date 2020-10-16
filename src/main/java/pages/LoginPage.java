package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
			jse = (JavascriptExecutor) driver; 
			 
	}
	
	@FindBy(id="Email")
	WebElement Emailtxt; 
	
	@FindBy(id="Password")
	WebElement Passwordtxt; 
	
	@FindBy(id="btnlogin")
	WebElement loginbtn; 
	
	@FindBy(xpath="/html/body/div[5]/div/div/nav/section/ul[2]/li[1]/a")
	public WebElement userlbl; 
	
	public void openLoginPage(String email, String pass) 
	{
		Emailtxt.sendKeys(email);
		Passwordtxt.sendKeys(pass);
		loginbtn.submit();
	}
}
