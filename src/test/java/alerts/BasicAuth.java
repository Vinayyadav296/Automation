package alerts;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuth {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
        WebElement result = driver.findElement(By.xpath("//div[@class='example']//p"));
        boolean actualResult=result.isDisplayed();
        System.out.println(actualResult);
        System.out.println(result.getText());
        driver.quit();
        
       }
}
