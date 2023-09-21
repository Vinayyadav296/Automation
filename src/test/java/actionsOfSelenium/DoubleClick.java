package actionsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://omayo.blogspot.com/");

		Actions actions = new Actions(driver);

		WebElement leftClick = driver.findElement(By.xpath("//p[@id='testdoubleclick']"));
        
		//We are double left clicking on the mouse using doubleClick()
		actions.moveToElement(leftClick).doubleClick().perform();

	}

}
