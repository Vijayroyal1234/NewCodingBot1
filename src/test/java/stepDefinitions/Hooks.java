package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	
	@Before
	public void beforeScenario() {
		
		System.out.println("I am running before scenario.");
		System.out.println("^%^%R@^U&^%@#&%#@&^%&%@&");
		
	}
	
	@After
	public void afterScenario() {
		System.out.println("I am running after scenario.");
		System.out.println("354235476235473546235463254762354763257");
		
	}
	


}
