package gwwpqa.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gwwpqa.AbstartComponents.AbstarctComponent;



public class CartPage extends AbstarctComponent{
	WebDriver driver;

	public CartPage(WebDriver driver) {
		// initialization
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//tr[@class='cart-item-row']/td[3]")
	List<WebElement> cartProduct;

	public List<WebElement> getCartItem() throws InterruptedException {
		Thread.sleep(3000);
		return cartProduct;

	}

	public WebElement getCartProduct(String product) throws InterruptedException {

		WebElement cartProductName=getCartItem().stream().filter(e->e.findElement(By.tagName("a")).getText().contains(product)).findFirst().orElse(null);
		return cartProductName;

	}



}
