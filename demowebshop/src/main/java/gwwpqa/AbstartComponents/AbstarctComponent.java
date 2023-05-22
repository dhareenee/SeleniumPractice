package gwwpqa.AbstartComponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AbstarctComponent {

WebDriver driver;

	public  AbstarctComponent(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css="div[class='header-links'] a[class='account']")
	WebElement userEmailHeader;

	@FindBy(id="topcartlink")
	WebElement cartBtn;



	public void waitforVisibility(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public String validateLoginUser() throws InterruptedException {
		Thread.sleep(10);
		waitforVisibility(userEmailHeader);
		return userEmailHeader.getText();
	}

	public void goTo() {
		driver.get("https://demowebshop.tricentis.com/");
		
	}

	public void clickCartBtn() {

		cartBtn.click();

	}
}
