package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		
		//This is used to refresh the page so that the modal appearing on the page will be closed
		driver.navigate().refresh();

		Actions actions = new Actions(driver);

		WebElement enterCity = driver.findElement(By.xpath("//input[@id='fromCity']"));

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.elementToBeClickable(enterCity));

		enterCity.click();

		WebElement cityInput = driver.findElement(By.xpath("//input[@placeholder='From']"));
		cityInput.sendKeys("Bang");

		for (int i = 1; i <= 4; i++) {
			//suggestions will not come immediately to handle this we are slowing the process of going down using arrow keys
			Thread.sleep(2000);
			cityInput.sendKeys(Keys.ARROW_DOWN);
		}
		cityInput.sendKeys(Keys.ENTER);

	}

}
