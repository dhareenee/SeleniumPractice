package Stepdefinitions;

import io.cucumber.java.en.Given;
import pageObjects.LoginPage;
import utils.TextContextSetup;

public class LoginPageStepDefinition {
	TextContextSetup textContextSetup;
	LoginPage loginPage;
	public LoginPageStepDefinition(TextContextSetup textContextSetup) {
		this.textContextSetup=textContextSetup;
		loginPage=textContextSetup.pageObjectManager.getLoginPage();
	}
	
	@Given("^Login with the useremail \"([^\"]*)\" and password \"([^\"]*)\" code$")
	public void login_with_useremail_password(String username,String Password) throws InterruptedException {
		loginPage.existUserLogin(username, Password);
	}
	
	
}
