package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LightBoxHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");

		driver.findElement(By.linkText("MacBook")).click();

		driver.findElement(By.xpath("(//img[@title='MacBook'])[1]")).click();
		
		driver.findElement(By.xpath("//button[@class='mfp-close']"));
		driver.quit();
	}
}
