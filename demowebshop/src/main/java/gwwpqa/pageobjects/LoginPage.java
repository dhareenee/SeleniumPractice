package gwwpqa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gwwpqa.AbstartComponents.AbstarctComponent;

public class LoginPage extends AbstarctComponent {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css=".ico-login")
	WebElement loginLnk;

	@FindBy(id="Email")
	WebElement lgnEmail;

	@FindBy(id="Password")
	WebElement lgnPassword;

	@FindBy(css=".login-button")
	WebElement loginbtn;


	public void loginUser(String email,String password) {
		loginLnk.click();
		lgnEmail.sendKeys(email);
		lgnPassword.sendKeys(password);
		loginbtn.click();
	}





}
