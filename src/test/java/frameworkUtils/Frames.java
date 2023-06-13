package frameworkUtils;

import org.openqa.selenium.By;

public class Frames extends WaitUtils  {
	
	public void switchTo(int frameIndex, int timeOut) {
		
		if (!waitForFrame(frameIndex, timeOut)) {
			System.out.println("Unable to switch to the frame with index: " + frameIndex);
		}
		
	}
	
	public void switchTo(int frameIndex) {

		if (!waitForFrame(frameIndex, DEFAULT_EXPLICIT_TIME_OUT)) {
			System.out.println("Unable to switch to the frame with index: " + frameIndex);
		}
	}
	
	public void switchTo(By by, int timeOut) {
		
		if (!waitForFrame(by, timeOut)) {
			System.out.println("Unable to switch to the frame with locator: " + by.toString());
		}
		
	}
	
	public void switchToParent() {
		
		try {
			Driver.get().switchTo().parentFrame();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
	}

}
