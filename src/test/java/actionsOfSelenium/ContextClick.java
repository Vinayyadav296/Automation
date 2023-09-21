package actionsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://tutorialsninja.com/demo/");

		WebElement serchField = driver.findElement(By.xpath("//input[@name='search']"));

		Actions actions = new Actions(driver);
        
		//Clicking the right button of the mouse using contextClick()
		actions.moveToElement(serchField).contextClick().perform();
	}

}
