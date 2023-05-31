package Stepdefinitions;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.SignupPage;
import utils.TextContextSetup;

public class SignupStepDefinitions {
	
	 TextContextSetup textContextSetup;
	 SignupPage signupPage;
	 public SignupStepDefinitions(TextContextSetup textContextSetup) {
			this.textContextSetup=textContextSetup;
			this.signupPage=textContextSetup.pageObjectManager.getSignupPage();
	 }
	 @Then("Fill the manadaotry amd the important details")
	    public void thenFillMandatoryAndImportantDetails(DataTable dataTable) {
	    	List<List<String>> obj=dataTable.asLists();
	    	textContextSetup.firstName=obj.get(0).get(0);
	    	textContextSetup.LastName=obj.get(0).get(1);
	    	String email = "Dha" + System.currentTimeMillis()+"@gmail.com";
	    	signupPage.newUserRegisterMandatoryField(obj.get(0).get(0),obj.get(0).get(1),email,"Qwerty@12345","Qwerty@12345");
	    	
	    }

	    
	

}
