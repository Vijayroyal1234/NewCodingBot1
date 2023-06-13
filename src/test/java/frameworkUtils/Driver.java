package frameworkUtils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver extends GlobalVariables {
	private static WebDriver driver;
	private static String mainWinHandle;
	
	private Driver() {
		
	}
	
	
	public static void newInstance(String browser) {
		browser = (browser == null)?"chrome":browser;
		switch (browser.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
			
		default:
			driver = new SafariDriver();
			break;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_TIME_OUT));
		mainWinHandle = driver.getWindowHandle();
	}
	
	public static WebDriver get() {
		return driver;
	}
	
	public static void navigate(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void closeCurrentWindow() {
		try {
			driver.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void switchToChild(String windowName) {
		boolean isWindowFound = false;
		Set<String> allHandles = driver.getWindowHandles();
		for (String handle: allHandles) {
			driver.switchTo().window(handle);
			if (driver.getTitle().contains(windowName)) {
				break;
			}
		}
		
		if (!isWindowFound) {
			System.out.println("child window with title : " + windowName+ " is not found.");
			driver.switchTo().window(mainWinHandle);
		}else {
			System.out.println("switched to window : " + windowName);
		}
		
	}
	
	
	public static void switchToChild(int index) {
		
		boolean isWindowFound = false;
		Set<String> allHandles = driver.getWindowHandles();
		
		try {
			driver.switchTo().window(new ArrayList<>(allHandles).get(index));
			isWindowFound = true;
		}catch(NoSuchWindowException e) {
			System.out.println(e.getMessage());
		}
		
		if (!isWindowFound) {
			System.out.println("child window with index : " + index+ " is not found.");
			driver.switchTo().window(mainWinHandle);
		}else {
			System.out.println("switched to window with index : " + index);
		}
		
	}
	

}
