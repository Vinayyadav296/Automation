package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	
	// so this above webdriver is diff from the webdriver present in the test class and we have to connect them otherwise we will ge
	//webdriver null error because the web driver present in the LoginPage class is diff from the TestLogin and has nothing in it
	// so when we create the object of the LoginPage class in the test login class in the constructor of LP class we pass the driver of the TL 
	//class which is now stored in driver of the LP class and these both got connected
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By email=By.id("input-email");
	private By password=By.id("input-password");
	private By loginButton=By.cssSelector("input.btn.btn-primary");
    
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(loginButton);
	}
}
