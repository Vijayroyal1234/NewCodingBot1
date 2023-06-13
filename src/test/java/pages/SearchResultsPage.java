package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import frameworkUtils.EventUtils;

public class SearchResultsPage extends EventUtils{
	private WebDriver driver;
	
	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyFlightResultsPage(String from, String to) {
		String expHeader = "Flights from "+from+" to "+to+":";
		String actHeader = waitForElement(By.tagName("h3")).getText();
		
		
		if (actHeader.equalsIgnoreCase(expHeader)) {
			System.out.println("Flight results displayed between two seleected cities");
		} else {
			System.out.println("Flight results page not displayed between selected cities.");
		}
		
	}
	
	
	public void selectFlightByAirLine(String airlineName) {
		try {
		
			String xpath =  "//td[text()='"+airlineName+"']/preceding-sibling::td/input";
			waitForElementClickable(driver.findElement(By.xpath(xpath))).click();
			
		} catch(NoSuchElementException e) {
			System.out.println("given airline :" + airlineName+ " is not available in the results.");
		}
		
		
	
		
	}
	
	public void selectFlightByFlightNumber(int flightNumber) {
		try {
		
			String xpath =  "//td[text()='"+flightNumber+"']/preceding-sibling::td/input";
			driver.findElement(By.xpath(xpath)).click();
			
		} catch(NoSuchElementException e) {
			System.out.println("given flight :" + flightNumber+ " is not available in the results.");
		}
		
		
	}
	
	public void selectFlightWithLowestPrice() {
		 List<WebElement> allRows =  driver.findElement(By.xpath("//table[@class='table']")).findElements(By.tagName("tr"));
		 double min = Double.MAX_VALUE;
		 WebElement searchButton = null;
		 for (int i = 1; i<= allRows.size()-1; i++) {
			 WebElement row = allRows.get(i);
			 
			 List<WebElement> allTds = row.findElements(By.tagName("td"));
			 String price =   allTds.get(5).getText();
			 Double dblPrice = Double.parseDouble(price.substring(1));
			 System.out.println(price);
			 if (dblPrice < min){
				 min = dblPrice;
				 searchButton = allTds.get(0).findElement(By.tagName("input"));
			 }
			 
			 
		 }
		 System.out.println("Lowest price : " + min);
		 
		 searchButton.click();
		
	}
	
	public void selectFlightWithHigestPrice() {
		 List<WebElement> allRows =  driver.findElement(By.xpath("//table[@class='table']")).findElements(By.tagName("tr"));
		 double max = 0;
		 WebElement searchButton = null;
		 for (int i = 1; i<= allRows.size()-1; i++) {
			 WebElement row = allRows.get(i);
			 
			 List<WebElement> allTds = row.findElements(By.tagName("td"));
			 String price =   allTds.get(5).getText();
			 System.out.println(price);
			 Double dblPrice = Double.parseDouble(price.substring(1));
			 if (dblPrice > max){
				 max = dblPrice;
				 searchButton = allTds.get(0).findElement(By.tagName("input"));
			 }
			 
			 
		 }
		 
		 System.out.println("Highest price : " + max);
		 
		 searchButton.click();
	}
	
}
