package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	
@CucumberOptions(features="C:\\Users\\prave\\eclipse-workspace\\CucumberFramework\\src\\test\\java\\Features",glue="Stepdefinitions",monochrome=true,tags="@NewUser",
plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"rerun:target/failed_scenarios.txt"})
public class TestngTestRunner extends AbstractTestNGCucumberTests{
	
	@DataProvider(parallel=true)
	public Object[][] sceanrio(){
		return super.scenarios();
	}


}
