package frameworkUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EventUtils extends WaitUtils{
	
	protected void selectValueFromList(WebElement listBox, String valueToSelect) {
		try {
			Select select = new Select(listBox);
			select.selectByVisibleText(valueToSelect);
		} catch(Exception e) {
			System.out.println("Exception while selecting the value : " + valueToSelect + " from the listbox.");
		}
		
		
	}
	
	public void clickElement(WebElement elem) {
		
		
		
	}

}
