package testCases;

import org.testng.annotations.Test;

import pages.CommonMethods;
import pages.HomePage;
import pages.SearchResultsPage;

public class BookFlights extends CommonMethods {
	
	
	@Test
	public void bookFlightWithLowestPrice() {
	
		launchBrowser();
		
		HomePage homePage = new HomePage(driver);
		SearchResultsPage resultsPage = new SearchResultsPage(driver);
		
		
		homePage.validateHeader();
		homePage.verifyDestinationLink();
		homePage.findFlights("Mexico City", "London");
		resultsPage.verifyFlightResultsPage("Mexico City", "London");
		resultsPage.selectFlightWithLowestPrice();
		
		
	}
	
	@Test
	public void bookFlightWithHighestPrice() {
	
		launchBrowser();
		
		HomePage homePage = new HomePage(driver);
		SearchResultsPage resultsPage = new SearchResultsPage(driver);
		
		
		homePage.validateHeader();
		homePage.verifyDestinationLink();
		homePage.findFlights("Mexico City", "London");
		resultsPage.verifyFlightResultsPage("Mexico City", "London");
		resultsPage.selectFlightWithHigestPrice();
		
		
		
	}

}
