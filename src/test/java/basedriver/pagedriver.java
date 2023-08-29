package basedriver;

import org.openqa.selenium.WebDriver;

public class pagedriver {
	public static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	private static pagedriver instance = null;
	private pagedriver() {
    }
	public static pagedriver getInstance() {
		if (instance == null) {
			instance = new pagedriver();
		}
		return instance;
		}
	public WebDriver getDriver() {
		return webDriver.get();
	}
	public WebDriver setDriver(WebDriver driver) {
		return webDriver.get();
	}
	public static WebDriver getCurrentDriver() {
		return getInstance().getDriver();
	}
	}
	
 