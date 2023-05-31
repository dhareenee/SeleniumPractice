package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	WebElement userEmail;
	
	@FindBy(id="pass")
	WebElement userPassword;
	
	@FindBy(xpath="//span[contains(text(),'Sign In')]")
	WebElement userLoginbtn;
	
	
	
	
	public void existUserLogin(String userEmailId ,String userPass) throws InterruptedException {
		
		userEmail.sendKeys(userEmailId);
		userPassword.sendKeys(userPass);
		userLoginbtn.click();
		Thread.sleep(3000);
		
		
	}
	
}
