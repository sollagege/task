package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase
{
	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver; 
		
	}
	
	@FindBy(linkText="تسجيل الدخول")
	WebElement loginLink; 

	@FindBy(linkText="تسجيل إشتراك جديد")
	WebElement registerLink; 
	
	@FindBy(xpath="/html/body/div[5]/div/div/nav/section/ul[2]/li[1]/ul/li[1]/a")
	WebElement contectbtn ; 
	
	@FindBy(xpath="//*[@id=\"user-form\"]/div/div[2]/div/label")
	public WebElement Namelbl; 
	
	
	
	
	public void openRegistrationPage() 
	{
		clickButton(loginLink);
		clickButton(contectbtn);
		clickButton(registerLink);
		
	}
	
	public void openLoginPage() 
	{
		clickButton(loginLink);
		clickButton(contectbtn);
	}
	
	

	

}
