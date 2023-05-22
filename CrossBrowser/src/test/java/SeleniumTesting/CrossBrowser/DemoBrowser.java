package SeleniumTesting.CrossBrowser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoBrowser {
	
	@Test
	public void titleCheck() throws MalformedURLException {
		MutableCapabilities cap=new MutableCapabilities();
		WebDriver driver=new RemoteWebDriver(new URL("https://hub.browserstack.com/wd/hub"),cap);
		driver.get("https://rahulshettyacademy.com");
	Assert.assertTrue(	driver.getTitle().matches("Selenium, API Testing, Software Testing & More QA Tutorials | Rahul Shetty Academy"));
	
	}

}
