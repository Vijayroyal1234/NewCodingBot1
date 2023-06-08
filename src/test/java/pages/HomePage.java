package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import frameworkUtils.EventUtils;

public class HomePage extends EventUtils{
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;	
	}
	
	
	public void validateHeader() {
		String expHeaderVal = "Welcome to the Simple Travel Agency!";
		
		String actHeaderVal =  driver.findElement(By.tagName("h1")).getText();
		
		if (actHeaderVal.equalsIgnoreCase(expHeaderVal)) {
			System.out.println("Header value displayed same as exepected. Expected is : " + expHeaderVal);
		} else {
			System.out.println("Header value is NOT displayed as expected. Expected is : " + expHeaderVal + " and Actual is : " + actHeaderVal);
		}
		
	}
	
	public void verifyDestinationLink() {
		driver.findElement(By.linkText("destination of the week! The Beach!")).click();
		
		String curURL = driver.getCurrentUrl();
		
		if (curURL.contains("vacation")) {
			System.out.println("URL after clicking desitnation link , contains the word vacation");
		} else {
			System.out.println("URL after clicking on desitnation link, does not contains the word vacation. ");
		}
		
		String curTitle = driver.getTitle();
		
		if (curTitle.contains("vacation")) {
			System.out.println("Page title after clicking desitnation link , contains the word vacation");
		} else {
			System.out.println("Page title after clicking desitnation link , does NOT contain the word vacation");
		}
		
		driver.navigate().back();
		
		
	}
	
	public void findFlights(String from, String to) {
		
		selectValueFromList(driver.findElement(By.name("fromPort")), from);
		selectValueFromList(driver.findElement(By.name("toPort")), to);
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		
	}
	
	
	
	
	

}
