package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import basedriver.pagedriver;
import utilities.CommonMethod;

/*
 *   1. PageFactory init
 *   2. Locators 
 */


public class Login extends CommonMethod {
	public Login() {
		PageFactory.initElements(pagedriver.getCurrentDriver(),this);
	}
	@FindBys({
		@FindBy(xpath = "//div[@class='visible-xs sign-in']//a"),
		@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/a[2]")
	})WebElement LoginRegister; // Login Or Register
	
	@FindBys({
		@FindBy(xpath = "//input[@id='username']"),
		@FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[2]/div[2]/form[1]/p[1]/input[1]")
	})WebElement username; // User Name Or Email 
	
	@FindBys({
		@FindBy (xpath = "//input[@id='password']")
	})WebElement password; // Password
	
	@FindBys({
		@FindBy (xpath = "//body/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[2]/div[2]/form[1]/p[3]/input[3]"),
		@FindBy (xpath = "//input[@name='login']"),
		@FindBy (xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[2]/div[2]/form[1]/p[3]/input[3]")
	})WebElement button; // Login Button
	
	@FindBys({
		@FindBy (xpath = "//a[contains(text(),'আপনি কি পাসওয়ার্ড ভুলে গেছেন?')]"),
		@FindBy (xpath = "/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/p[1]/a[1]")
	})WebElement forget; // Forget Password
	
	public void loginpage() throws InterruptedException {
		timeout();
		try {
			if (LoginRegister.isDisplayed()) {
				LoginRegister.click();
			timeout();
			}
	    	} catch (Exception e) {
	    		System.out.println(e);
	    	}
		try {
			if (button.isEnabled()) {
			button.click();	
			timeout();
			}
	    	} catch (Exception e) {
	    		System.out.println(e);
	    	}
		try {
			if (username.isDisplayed()) {
			username.clear();
			username.sendKeys("Amudassr@gmail.com");
			timeout();
			}
	    	} catch (Exception e) {
	    		System.out.println(e);
	    	}
		try {
			if (password.isDisplayed()) {
			password.clear();
			password.sendKeys("Abc@41230.");
			timeout();
			}
	    	} catch (Exception e) {
	    		System.out.println(e);
	    	}
		try {
			if (button.isEnabled()) {
			button.click();	
			timeout();
			}
	    	} catch (Exception e) {
	    		System.out.println(e);
	    	}
		try {
			if (username.isDisplayed()) {
			username.clear();
			username.sendKeys("Amudassor@gmail.com");
			timeout();
			}
	    	} catch (Exception e) {
	    		System.out.println(e);
	    	}
		try {
			if (password.isDisplayed()) {
			password.clear();
			password.sendKeys("Abcd@41230.");
			timeout();
			}
	    	} catch (Exception e) {
	    		System.out.println(e);
	    	}
		try {
			if (button.isEnabled()) {
			button.click();	
			timeout();
			}
	    	} catch (Exception e) {
	    		System.out.println(e);
	    	}
		
		
	}
}
