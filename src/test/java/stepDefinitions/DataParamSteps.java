package stepDefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DataParamSteps {
	private WebDriver driver;
	@Given("launch browser {string} browser and navigate to {string}")
	public void launchApplication(String browser, String url) {
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		}
		
		driver.get(url);
		
	}
	
	@Given("login to the application and validate")
	public void login(DataTable dt) {
		Map<String, String> data = dt.asMap();
		System.out.println("you have given username as : " + data.get("username") + ";;; password : " + data.get("password"));
		System.out.println("I am in login method.");
	}
	
	@Then("enter employee personal data")
	public void enterEmpBasicInfo(DataTable dt) {
		Map<String, String> vals =  dt.asMap();
		
		
	}
	
	@Given("^launch (.*) and navigate to (.*)$")
	public void launchApp(String browser , String url) {
		System.out.println(browser + "  :::: " + url);
	}
	
	@Given("^enter (.*) and (.*) and click on login button$")
	public void logindata(String username, String password) {
		System.out.println(username + " :::::" + password);
	}

}
