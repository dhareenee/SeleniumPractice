package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	
@CucumberOptions(features="@target/failedScenarios.txt",glue="Stepdefinitions",monochrome=true,plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestngFailedTestRunner extends AbstractTestNGCucumberTests{
	
	@DataProvider(parallel=true)
	public Object[][] sceanrio(){
		return super.scenarios();
	}


}
