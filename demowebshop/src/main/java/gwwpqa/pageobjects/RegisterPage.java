package gwwpqa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gwwpqa.AbstartComponents.AbstarctComponent;

public class RegisterPage extends AbstarctComponent{

	WebDriver driver;

	public  RegisterPage(WebDriver driver) {
		super(driver);

		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css=".ico-register")
	WebElement registerlnk;

	@FindBy(id="gender-female")
	WebElement femaleGender;

	@FindBy(id="gender-male")
	WebElement maleGender;

	@FindBy(id="FirstName")
	WebElement firstName;


	@FindBy(id="LastName")
	WebElement lastName;

	@FindBy(id="Email")
	WebElement email;


	@FindBy(id="Password")
	WebElement password;

	@FindBy(id="ConfirmPassword")
	WebElement confirmPassword;

	@FindBy(id="register-button")
	WebElement registerButton;

	@FindBy(css=".result")
	WebElement successRegisterMsg;

	@FindBy(css=".button-1.register-continue-button")
	WebElement registerContinue;
	@FindBy(xpath="//h1[contains(text(),'Register')]")
	WebElement registerHeader;



	public void homeToRegisterPage() {
		registerlnk.click();
		waitforVisibility(registerHeader);

	}

	public void fillOptionalfields(String gender) {

		if(gender.equalsIgnoreCase("female")) {
			femaleGender.click();
		}else if(gender.equalsIgnoreCase("male")) {
			maleGender.click();
		}

	}

	public void fillMadantoryFields(String FirstName,String LastName ,String Email,String Password,String CPassword ) {
		firstName.sendKeys(FirstName);
		lastName.sendKeys(LastName);
		email.sendKeys(Email);
		password.sendKeys(Password);
		confirmPassword.sendKeys(CPassword);
	}

	public WebElement clickRegister() {
		registerButton.click();
		waitforVisibility(successRegisterMsg);

		return successRegisterMsg;
		}

	public void resgisterCont() {

		registerContinue.click();

	}




}
