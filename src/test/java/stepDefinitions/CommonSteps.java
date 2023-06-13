package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.BasePage;

public class CommonSteps extends BasePage{
	
	@Given("user verifies if the home page is landed")
	public void verifyHomePageHeader() {
		getHomePage().validateHeader();
	}
	
	@Given("user verifies destination link")
	public void verifyDestinationLink() {
		getHomePage().verifyDestinationLink();
	}

}
