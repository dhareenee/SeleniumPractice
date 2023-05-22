package gwwpqa.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import gwwpqa.AbstartComponents.AbstarctComponent;

public class ProductPage extends AbstarctComponent{
	WebDriver driver;
	public ProductPage(WebDriver driver) {
		super(driver);

		this.driver=driver;
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id="small-searchterms")
	WebElement searchBar;
	@FindBy(css=".ui-menu-item")
	List<WebElement>  productSearchList;
	@FindBy(css=".add-to-cart-button")
	WebElement addToCartBtn;
	@FindBy(id="bar-notification")
	WebElement addtoCartNotification;





	public void searchBar(String product) throws InterruptedException {
		searchBar.sendKeys(product);
		Thread.sleep(3000);
	}
	public List<WebElement> getProductList() {


		return productSearchList;
	}

public void searchProduct(String productEle) {


	WebElement product=getProductList().stream().filter(e->e.findElement(By.cssSelector(".ui-corner-all")).getText().contains(productEle)).findFirst().orElse(null);
	product.click();

}

public void addProductToCart() {
	addToCartBtn.click();
	}
public String getAddtoCartNotification() {
	waitforVisibility(addtoCartNotification);
	return addtoCartNotification.getText();
}


}
