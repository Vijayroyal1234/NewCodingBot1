package testCases;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.CommonMethods;
import pages.HomePage;
import pages.SearchResultsPage;

public class BookFlights extends BasePage {
	
	
	@Test
	public void bookFlightWithLowestPrice() {
	

		getHomePage().validateHeader();
		getHomePage().verifyDestinationLink();
		getHomePage().findFlights("Mexico City", "London");
		getSearchResultsPage().verifyFlightResultsPage("Mexico City", "London");
		getSearchResultsPage().selectFlightWithLowestPrice();
		
		
	}
	
	@Test
	public void bookFlightWithHighestPrice() {
	
		
		getHomePage().validateHeader();
		getHomePage().verifyDestinationLink();
		getHomePage().findFlights("Mexico City", "London");
		getSearchResultsPage().verifyFlightResultsPage("Mexico City", "London");
		getSearchResultsPage().selectFlightWithHigestPrice();
		
		
		
	}

}
