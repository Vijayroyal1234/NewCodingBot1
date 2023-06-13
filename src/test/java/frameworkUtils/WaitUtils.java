package frameworkUtils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils extends GlobalVariables {
	
	public boolean waitForFrame(int frameIndex, int timeOut) {
		try {
			WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(timeOut));
			wait.pollingEvery(Duration.ofMillis(200));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(timeOut));
		return true;
		} catch (Exception e) {
			System.out.println("Unable to switch to the frame with index : " + frameIndex+" . frame not found even after waiting for " + timeOut+ " seconds.");
			return false;
		}
		
		
	}
	
	public boolean waitForFrame(By frameLocator, int timeOut) {
		try {
			WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(timeOut));
			wait.pollingEvery(Duration.ofMillis(200));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
			return true;
		} catch (Exception e) {
			System.out.println("Unable to switch to the frame with locator : " + frameLocator.toString()+" . frame not found even after waiting for " + timeOut+ " seconds.");
			return false;
		}
		
		
	}
	
	public WebElement waitForElement(By by, int timeOut) {
		try {
			WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(timeOut));
			wait.pollingEvery(Duration.ofMillis(200));
			return wait.until(ExpectedConditions.presenceOfElementLocated(by));
			 
			
		} catch (Exception e) {
			System.out.println("Element with locator : " + by.toString()+" not found even after waiting for "+ timeOut+" seconds.");
			 return null;
		}
		
	}
	
	public WebElement waitForElement(By by) {
		try {
			WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(DEFAULT_EXPLICIT_TIME_OUT));
			wait.pollingEvery(Duration.ofMillis(200));
			return wait.until(ExpectedConditions.presenceOfElementLocated(by));
			 
			
		} catch (Exception e) {
			System.out.println("Element with locator : " + by.toString()+" not found even after waiting for "+ DEFAULT_EXPLICIT_TIME_OUT+" seconds.");
			 return null;
		}
		
	}
	
	public WebElement waitForElementVisible(By by) {
		WebElement elem = waitForElement(by);
		if (elem != null) {
			try {
				WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(DEFAULT_EXPLICIT_TIME_OUT));
				wait.pollingEvery(Duration.ofMillis(200));
				return wait.until(ExpectedConditions.visibilityOf(elem));
				 
				
			} catch (Exception e) {
				System.out.println("Element :" + elem.toString()+"  is not visible even after waiting for seconds : " + DEFAULT_EXPLICIT_TIME_OUT);
				 return null;
			}
		
		} else {
			return null;
		}
	}
	
	public WebElement waitForElementVisible(WebElement elem) {
		if (elem != null) {
			try {
				WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(DEFAULT_EXPLICIT_TIME_OUT));
				wait.pollingEvery(Duration.ofMillis(200));
				return wait.until(ExpectedConditions.visibilityOf(elem));
				 
				
			} catch (Exception e) {
				System.out.println("Element :" + elem.toString()+"  is not visible even after waiting for seconds : " + DEFAULT_EXPLICIT_TIME_OUT);
				 return null;
			}
		
		} else {
			return null;
		}
	}
	
	public WebElement waitForElementVisible(WebElement elem, int timeOut) {
		if (elem != null) {
			try {
				WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(timeOut));
				wait.pollingEvery(Duration.ofMillis(200));
				return wait.until(ExpectedConditions.visibilityOf(elem));
				 
				
			} catch (Exception e) {
				System.out.println("Element :" + elem.toString()+"  is not visible even after waiting for seconds : " + timeOut);
				return null;
			}
		
		} else {
			return null;
		}
	}
	
	
	
	public WebElement waitForElementClickable(WebElement elem, int timeOut) {
		if (waitForElementVisible(elem, timeOut) != null) {
			try {
				WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(timeOut));
				wait.pollingEvery(Duration.ofMillis(200));
				return wait.until(ExpectedConditions.elementToBeClickable(elem));
				 
				
			} catch (Exception e) {
				System.out.println("Element :" + elem.toString()+"  is not enabled even after waiting for seconds : " + timeOut);
				 return null;
			}
		
		} else {
			return null;
		}
	}
	
	public WebElement waitForElementClickable(WebElement elem) {
		if (waitForElementVisible(elem) != null) {
			try {
				WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(DEFAULT_EXPLICIT_TIME_OUT));
				wait.pollingEvery(Duration.ofMillis(200));
				return wait.until(ExpectedConditions.elementToBeClickable(elem));
				 
				
			} catch (Exception e) {
				System.out.println("Element :" + elem.toString()+"  is not enabled even after waiting for seconds : " + DEFAULT_EXPLICIT_TIME_OUT);
				 return null;
			}
		
		} else {
			return null;
		}
	}
	
	public WebElement waitForElementClickable(By by) {
		WebElement elem = waitForElement(by);
		if (waitForElementVisible(elem) != null) {
			try {
				WebDriverWait wait = new WebDriverWait(Driver.get(), Duration.ofSeconds(DEFAULT_EXPLICIT_TIME_OUT));
				wait.pollingEvery(Duration.ofMillis(200));
				return wait.until(ExpectedConditions.elementToBeClickable(elem));
				 
				
			} catch (Exception e) {
				System.out.println("Element :" + elem.toString()+"  is not enabled even after waiting for seconds : " + DEFAULT_EXPLICIT_TIME_OUT);
				 return null;
			}
		
		} else {
			return null;
		}
	}

}
