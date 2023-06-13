package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.BasePage;

public class BookFlightSteps extends BasePage {
	
	@Given("^user searches for the flight (.*) and (.*)$")
	public void performFlightSearch(String from, String to) {
		getHomePage().findFlights(from, to);
	}
	
	@Given("^verifies if the flight results are appeared between (.*) and (.*)$")
	public void verifySearchResults(String from, String to) {
		getSearchResultsPage().verifyFlightResultsPage(from, to);
	}

	
	@Then("user selects the lowest priced flight")
	public void selectLowestPriceFlight() {
		getSearchResultsPage().selectFlightWithLowestPrice();
	}
}
