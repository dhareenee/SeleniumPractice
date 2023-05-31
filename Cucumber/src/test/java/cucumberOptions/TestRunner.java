package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ="\\src\\test\\java\\features",
		glue="stepdefinitions",tags="@MobileTest or @WebTest",
		plugin= {"pretty","html:target/cumcumber.html"})

public class TestRunner extends AbstractTestNGCucumberTests{
	
	
	
	
}
