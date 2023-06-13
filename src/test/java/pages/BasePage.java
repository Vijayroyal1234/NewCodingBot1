package pages;

import frameworkUtils.Driver;

public class BasePage extends CommonMethods {
	
	public ConfirmationPage getConfirmPage() {
		return new ConfirmationPage();
	}

	public HomePage getHomePage() {
		return new HomePage(Driver.get());
	}
	
	public PurchasePage getPurchasePage() {
		return new PurchasePage();
	}
	
	public SearchResultsPage getSearchResultsPage() {
		return new SearchResultsPage(Driver.get());
	}
	
	
}
