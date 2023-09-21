package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {

	WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		this.driver=driver;
	}

	private By myAccountBreadCrumb = By.linkText("Account");

	public WebElement getmyAccount() {
		return driver.findElement(myAccountBreadCrumb);
	}
}
