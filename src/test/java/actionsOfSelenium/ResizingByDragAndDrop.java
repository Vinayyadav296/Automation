package actionsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizingByDragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/resizable/");

		Actions actions = new Actions(driver);
		
		WebElement frameName = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frameName);
		
		WebElement resizable = driver.findElement(By.id("resizable"));
		
		actions.dragAndDropBy(resizable, 10, 120).perform();

	}

}
