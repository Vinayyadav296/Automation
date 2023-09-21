package pageFactoryModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPagePf {
	WebDriver driver;

	public MyAccountPagePf(WebDriver driver) {
		this.driver = driver;
		//We are initializing the weblement objects determined by @findby
		//this represents the class in initElements method
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Account")
	WebElement myAccountBreadCrumb;

	

	public WebElement getmyAccount() {
		return myAccountBreadCrumb;
	}
}
