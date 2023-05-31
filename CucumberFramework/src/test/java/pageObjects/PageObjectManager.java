package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	LandingPage landingPage;
	SignupPage signUpPage;
	AccountPage accountPage;
	LoginPage loginPage;
	ProductPage productPage;
	
	WebDriver driver;
	
	public   PageObjectManager (WebDriver driver){
		this.driver=driver;
	}
	
	public LandingPage getLandingPage() {
		 landingPage=new LandingPage(driver);
		return landingPage;
	}
	
	public SignupPage getSignupPage() {
		signUpPage=new SignupPage(driver);
		return signUpPage;
	}
	
	public AccountPage getAccountPage() {
		accountPage=new AccountPage(driver);
		return accountPage;
	}
	
	public LoginPage getLoginPage() {
		loginPage=new LoginPage(driver);
		return loginPage;
	}
	
	public ProductPage getProductPage() {
		productPage=new ProductPage(driver);
		return productPage;
	}
	
	
	


}
