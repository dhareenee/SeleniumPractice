package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver driver;
	public ProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(css=".product-item-link")
	List<WebElement> productName;
	
	
	@FindBy(id="option-label-size-143-item-166")
	
	WebElement XSsize;
	
	@FindBy(id="option-label-size-143-item-167")
	WebElement Ssize;
	
	@FindBy(id="option-label-size-143-item-168")
	WebElement Msize;
	
	@FindBy(id="option-label-size-143-item-169")

	WebElement Lsize;
	
	@FindBy(id="option-label-size-143-item-170")
	WebElement XLsize;
	
	@FindBy(id="option-label-color-93-item-56")
	WebElement OrangeColour;
	
	@FindBy(id="option-label-color-93-item-50")
	WebElement BlueColour;
	
	@FindBy(id="option-label-color-93-item-57")
	WebElement PurpulColor;
	
	@FindBy(id="product-addtocart-button")
	WebElement productAddtoCartBtn;

	public void getProduct(String ProductName) throws InterruptedException {
		
		WebElement product=productName.stream().filter(e->e.getText().equalsIgnoreCase(ProductName)).findFirst().orElse(null);
		product.click();
		Thread.sleep(3000);
	}
	
	public void selectSizeColorProduct(String Size,String Colour) {
		if(Size.equalsIgnoreCase("XS")) {
			XSsize.click();
		}
		else if(Size.equalsIgnoreCase("s")) {
			Ssize.click();
		}else if(Size.equalsIgnoreCase("m")) {
			Msize.click();
		}else if(Size.equalsIgnoreCase("l")) {
			Lsize.click();
		}else if(Size.equalsIgnoreCase("XL")) {
			XLsize.click();
		}
		
		if(Colour.equalsIgnoreCase("Blue")) {
			BlueColour.click();
		}else if(Colour.equalsIgnoreCase("Orange")) {
			OrangeColour.click();
		}else if(Colour.equalsIgnoreCase("Purpul")) {
			PurpulColor.click();
		}
	}
	
	
	public void AddToCartButton() {
		productAddtoCartBtn.click();
	}
}
