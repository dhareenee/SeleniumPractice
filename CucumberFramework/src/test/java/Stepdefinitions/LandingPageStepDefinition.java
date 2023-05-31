package Stepdefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TextContextSetup;

public class LandingPageStepDefinition {
	LandingPage landingPage;

	TextContextSetup textContentSetup;
	public LandingPageStepDefinition(TextContextSetup textContentSetup) {
		this.textContentSetup=textContentSetup;
		this.landingPage=textContentSetup.pageObjectManager.getLandingPage();
	}
	@Given("Land on the Luma portal page")
    public void givenLandOnLumaPortalPage() {
	 Assert.assertTrue(landingPage.getTitleLandingPage().contains("Home Page"));
    }
	@When("User navigate to the signup page")
    public void whenUserNavigatesToSignupPage() throws InterruptedException {
		
		landingPage.newUserSignUpBtn();	
    }
	
	@Given("Navigate to Login page")
	public void navigate_to_Login_page() {
		landingPage.existUserLoginBtn();
	}
	
	@When("User navigate to women-Tees catagory")
	public void user_navigate_to_women_tees() {
		landingPage.moverhoverOnWomenHeader();
		landingPage.mouserhoverOnWomenTop();
		landingPage.mouserhoverOnWomenTees();
	}
	
	
	
	
}
