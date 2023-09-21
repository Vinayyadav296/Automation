package actionsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		Actions actions = new Actions(driver);
		
		WebElement oslo=driver.findElement(By.id("box1"));
		
		WebElement us=driver.findElement(By.id("box103"));
		
		//instead of using three method we can use predefined method of selenium dragAndDrop()
		//actions.clickAndHold(oslo).moveToElement(us).release().build().perform();
		
		actions.dragAndDrop(oslo, us).perform();

	}


}
