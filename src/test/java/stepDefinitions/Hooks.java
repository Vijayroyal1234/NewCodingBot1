package stepDefinitions;

import frameworkUtils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
	@Before
	public void beforeScenario() {
		Driver.newInstance("chrome");
		Driver.navigate("https://blazedemo.com/");
	
	}
	
	@After
	public void afterScenario() {
		Driver.quit();
	}
	


}
