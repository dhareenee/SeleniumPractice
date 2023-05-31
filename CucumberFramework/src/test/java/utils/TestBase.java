package utils;

import java.time.Duration;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("Url");
		if(prop.getProperty("browser").equalsIgnoreCase("Chrome")) {
		if (driver==null) {
		driver=new ChromeDriver();
		}
	     WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(30));
		 driver.manage().window().maximize();
		 driver.get(url);
		}
		 return driver;
	}

}
