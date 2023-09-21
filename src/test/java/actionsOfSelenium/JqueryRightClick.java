package actionsOfSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JqueryRightClick {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

		Actions actions = new Actions(driver);
		
		WebElement rightClick = driver.findElement(By.xpath("//span[.='right click me']"));
		
		actions.moveToElement(rightClick).contextClick().perform();
		
		WebElement quitOption = driver.findElement(By.xpath("//span[.='Quit']"));
		
		actions.click(quitOption).perform();
		
		Alert a=driver.switchTo().alert();
		
		String alertText=a.getText();
		System.out.println(alertText);
		a.accept();

	}

}
