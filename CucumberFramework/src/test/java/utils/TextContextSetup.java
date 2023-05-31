package utils;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.PageObjectManager;

public class TextContextSetup {
	public WebDriver driver;
	public String firstName;
    public String	LastName;
	public TestBase testBase;
	public PageObjectManager pageObjectManager;
	

	
	public TextContextSetup() throws IOException{
		
		
		testBase=new TestBase();
		 pageObjectManager=new PageObjectManager(testBase.WebDriverManager());
		
	}
}
