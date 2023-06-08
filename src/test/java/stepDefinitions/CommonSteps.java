package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CommonSteps {
	
	@Given("close all the running browsers")
	public void killBrowsers() {
		System.out.println("all the running browsers have been closed and I am in background.");
	}
	
	@Given("verify the environment is active or not")
	public void validateEnvironment() {
		System.out.println("environment is verified successfully and I am in background.");
	}
	
	@Given("login to the application")
	public void login() {
		System.out.println("Login to the application");
	}
	
	
	@Given("launch the application")
	public void launchApplication() {
		System.out.println("launch browser and navigate");
	}
	
	@And("logout from application")
	public void logout() {
		System.out.println("Successfully loggedout from application.");
		
	}
	
	@When("login to the application as employee")
	public void loginAsEmployee() {
		System.out.println("Employee hass been logged in.");
	}

}
