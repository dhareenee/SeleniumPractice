package stepdefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
	 @Given("User should be in the login page of the application")
	    public void user_is_on_login_page() {
	        System.out.println("Login page landing");
	    }

	 @When("User should provide valid user {string} and password {string}")
	 public void user_should_provide_valid_user_and_password(String userName, String password) {
	     // Write code here that turns the phrase above into concrete actions
		 System.out.println(userName);
	     System.out.println(password);
	     
	 }
	 
	 @Then("The user should be landed to the homepage")
	    public void user_lands_on_homepage() { 
	    	System.out.println("Hompagelanding");
	    }
	 
	 @Then("Able to see the all the carts is {string}")
	 public void able_to_see_the_all_the_carts_is(String booleanValue) {
	     // Write code here that turns the phrase above into concrete actions
		  System.out.println(booleanValue);
	 }
	 @When("User should signin with the following details")
	 public void user_should_signin_with_the_following_details(DataTable dataTable) {
		 
		 List<List<String>> obj=dataTable.asLists();
		 
		System.out.println( obj.get(0).get(0));
		System.out.println( obj.get(0).get(1));
		System.out.println( obj.get(0).get(2));
		System.out.println( obj.get(0).get(3));
		 
	     
	 }
	 @When("^User login in to application with (.+) and password (.+)$")
	    public void user_login_into_application_with_and_password(String username, String password) throws Throwable {
	       System.out.println(username);
	       System.out.println(password);
	       
	    }
	 
	 @Given("the browser should login")
	 public void the_browser_should_login() {
		 System.out.println("the browser should logi");
	 }

	 @When("the code is triggered")
	 public void the_code_is_triggered() {
		 System.out.println("the code is triggered");
	 }

	 @Then("the url should given and triggered")
	 public void the_url_should_given_and_triggered() {
		 System.out.println("the url should given and triggered");
	 }

	   


}
