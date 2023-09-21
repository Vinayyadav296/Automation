package actionsOfSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyBoardEvent {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

		WebElement firstName = driver.findElement(By.id("input-firstname"));
		
		firstName.sendKeys("Vinay");

		Actions actions = new Actions(driver);
		
		actions.sendKeys(Keys.TAB).sendKeys("Yadav").pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).sendKeys("yadavvinay456@gmail.com").pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).sendKeys("5456656565").pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).sendKeys("Vinay@321").pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB).sendKeys("Vinay@321").pause(Duration.ofSeconds(1))
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
		.sendKeys(Keys.SPACE)
		.sendKeys(Keys.ENTER).build().perform();

	}

}
