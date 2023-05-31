package Stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.OutputType;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TextContextSetup;

public class Hooks {
	TextContextSetup textContentSetup;
	
	public Hooks(TextContextSetup textContentSetup) {
		this.textContentSetup=textContentSetup;
	}
	@After
	public void tearDown() {
		textContentSetup.testBase.driver.quit();
	}

	@AfterStep
	public void screenshot(Scenario Scenario) throws IOException {
		
		WebDriver driver =textContentSetup.testBase.WebDriverManager();
		if(Scenario.isFailed())
		{
		//screenshot
		File sourcePath= 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	byte[] ScreenConetent=	FileUtils.readFileToByteArray(sourcePath);
	Scenario.attach(ScreenConetent, "image/png", "image");
		
	}
	}
	
}
