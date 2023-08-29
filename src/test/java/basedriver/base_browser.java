package basedriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


import io.github.bonigarcia.wdm.WebDriverManager;

public class base_browser {
	
	public static String url = "https://www.wafilife.com";
	
	WebDriver driver = null;
	
	@BeforeSuite
	public void start() {
		String browser = System.getProperty("browser", "chrome");
		if (browser.contains("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if (browser.contains("chrome")) {
	 
			ChromeOptions options = new ChromeOptions();
			options.setAcceptInsecureCerts(true);
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		pagedriver.getInstance().setDriver(driver);
	}
		
		
	
	
	@AfterSuite
	public void close() {
		pagedriver.getCurrentDriver().quit();
	}

}
