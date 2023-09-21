package actionsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");

		Actions actions = new Actions(driver);
		
		WebElement jqueryLink = driver.findElement(By.linkText("jqueryui"));
		
		//KeyDown means clicking the control key and then along with mouse click on jquery link and then leave the control key
		// this will open the link in the new tab
		actions.keyDown(Keys.CONTROL).moveToElement(jqueryLink).click().keyUp(Keys.CONTROL).build().perform();

	}

}
