package actionsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/p/page3.html");
		
		WebElement slider=driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));

		Actions actions = new Actions(driver);
		
		//Y offset value will be 0 because slider is moving only in horizontal direction
	//	actions.moveToElement(slider).dragAndDropBy(slider, 100, 0).perform(); //moving the slider in right direction
		
		//moving the slider to the left direction
		
		actions.moveToElement(slider).dragAndDropBy(slider, -100, 0).perform();
	}

}
