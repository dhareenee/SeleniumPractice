package Stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ProductPage;
import utils.TextContextSetup;

public class ProductPageStepDefinition {
	TextContextSetup textContextSetup;
	ProductPage productPage;
	public ProductPageStepDefinition(TextContextSetup textContextSetup) {
		this.textContextSetup=textContextSetup;
		this.productPage=textContextSetup.pageObjectManager.getProductPage();
		
	}
	
	
	@When("^Go to \"([^\"]*)\" from the product list$")
	public void go_to_Product_list(String ProductName) throws InterruptedException {
		
		productPage.getProduct(ProductName);
		
	}
	
	@Then("^Give \"([^\"]*)\" Size and \"([^\"]*)\" colour$")
	public void select_color_size_product(String Size ,String Colour) {
		productPage.selectSizeColorProduct(Size, Colour);
	
	}
	
	@Then("^proceed the checkout$")
	public void proceed_the_checkout() {
		productPage.AddToCartButton();
	}

}
