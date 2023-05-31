package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[@class='panel header']//a[@href='https://magento.softwaretestingboard.com/customer/account/create/']")
	WebElement SignUpBtn;
	
	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	WebElement LoginBtn;
	
	@FindBy(id="ui-id-4")
	WebElement WomenCatHeader;
	
	@FindBy(id="ui-id-9")
	WebElement WomenCatTopHeader;
	
	@FindBy(id="ui-id-13")
	WebElement WomenCatTeesHeader;
	
	public void newUserSignUpBtn() throws InterruptedException {
		SignUpBtn.click();
		Thread.sleep(3000);
	}
	public String getTitleLandingPage() {
		
		return driver.getTitle();
	}
	public void existUserLoginBtn() {
		LoginBtn.click();
	}
	
	public void moverhoverOnWomenHeader() {
		Actions action=new Actions(driver);
		action.moveToElement(WomenCatHeader).build().perform();;
		
	}
	
	public void mouserhoverOnWomenTop() {
		Actions action=new Actions(driver);
		action.moveToElement(WomenCatTopHeader).build().perform();;
	}

	public void mouserhoverOnWomenTees() {
		Actions action=new Actions(driver);
		action.moveToElement(WomenCatTeesHeader).click().build().perform();;
	}


}
