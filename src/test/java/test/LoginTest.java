package test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import basedriver.base_browser;
import basedriver.pagedriver;
import pages.Login;

public class LoginTest extends base_browser{
	@BeforeClass
	public void openUrl(){
		pagedriver.getCurrentDriver().manage().window().maximize();
		pagedriver.getCurrentDriver().get(url);
	}
	@Test(priority = 0)
	public void logintest() throws InterruptedException {
		Login login = new Login();
		login.loginpage();
	}

}
