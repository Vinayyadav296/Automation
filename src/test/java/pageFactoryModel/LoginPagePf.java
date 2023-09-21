package pageFactoryModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePf {
   
	WebDriver driver;
	public LoginPagePf(WebDriver driver) {
		this.driver=driver;
		//We are initializing the weblement objects determined by @findby
		//this represents the class in initElements method
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="input-email")
	WebElement email;
	
	@FindBy(id="input-password")
	WebElement password;
	
	@FindBy(css="input.btn.btn-primary")
	WebElement loginButton;
    
	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}
}
