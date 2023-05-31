package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
	@Before("@MobileTest")
	public void beforeAllScenario(){
		
		System.out.println("BeforeMobileTest");
		
	}
	
	@After("@MobileTest")
	public void afterAllScenarios() {
		System.out.println("AfterMobileTest");
	}
}
