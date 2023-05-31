package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	WebDriver driver;
	public SignupPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="firstname")
	WebElement FirstName;
	
	@FindBy(id="lastname")
	WebElement Lastname;
	
	@FindBy(id="email_address")
	WebElement EmailAddress;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="password-confirmation")
	WebElement Cpassword;
	
	@FindBy(xpath="//button[contains(@class,'submit')]")
	WebElement SignUpBtn;
	
	public void newUserRegisterMandatoryField(String firstName, String LastName, String email, String password, String ConfPassword) {
		FirstName.sendKeys(firstName);
		Lastname.sendKeys(LastName);
		EmailAddress.sendKeys(email);
		Password.sendKeys(password);
		Cpassword.sendKeys(ConfPassword);
		SignUpBtn.click();
	
	}

}
