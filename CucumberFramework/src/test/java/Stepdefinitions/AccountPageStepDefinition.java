package Stepdefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.And;
import pageObjects.AccountPage;
import pageObjects.PageObjectManager;
import utils.TextContextSetup;

public class AccountPageStepDefinition {
	TextContextSetup textContextSetup;
	 AccountPage accountPage;
	public AccountPageStepDefinition(TextContextSetup textContextSetup) {
		this.textContextSetup=textContextSetup;
		this.accountPage=textContextSetup.pageObjectManager.getAccountPage();
		
	}
	
	@And("Validate the user logged into the website")
    public void andValidateUserLoggedIn() throws InterruptedException {
		
		
		String info= accountPage.getLoginUserInfo();
        String n=textContextSetup.firstName+" " +textContextSetup.LastName;
        Assert.assertTrue(info.contains(n));
    }
}
