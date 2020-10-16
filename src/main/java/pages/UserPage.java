package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends PageBase {

	public UserPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}

	@FindBy(id = "btn-later")
	public WebElement laterbtn;

	@FindBy(id = "UserName")
	private WebElement UserNameTxt;

	@FindBy(id = "Password")
	private WebElement PasswordTxt;

	@FindBy(id = "user-password")
	private WebElement userpasswordTxt;

	@FindBy(id = "Email")
	private WebElement Emailtxt;

	@FindBy(id = "ConfirmEmail")
	private WebElement ConfirmEmailtxt;

	@FindBy(id = "TermsAgreed")
	private WebElement TermsAgreedcheck;

	@FindBy(id = "btnlogin")
	private WebElement loginbtn;

	@FindBy(className = "success button")
	public WebElement messageNotification;

	public void Registerform(String name, String pass, String email) throws InterruptedException {
		UserNameTxt.sendKeys(name);
		PasswordTxt.sendKeys(pass);
		userpasswordTxt.sendKeys(pass);
		Emailtxt.sendKeys(email);
		ConfirmEmailtxt.sendKeys(email);
		scrollToBottom();
		clickButton(TermsAgreedcheck);
		loginbtn.submit();
		//////////////////////////////////////////////////////////////////////////
		// Notice there're some info for g-recaptcha i need it to complete cycle //
		//////////////////////////////////////////////////////////////////////////

	}

}
