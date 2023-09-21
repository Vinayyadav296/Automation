package handleStaticAndDynamicTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTableHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://demo.opencart.com/admin/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("demo");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		WebElement modal=driver.findElement(By.xpath("//button[@class='btn-close']"));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.elementToBeClickable(modal));
		
		modal.click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Sales')]")).click();
		
		driver.findElement(By.xpath("(//a[contains(text(),'Orders')])[1]")).click();
		
		driver.findElement(By.xpath("//form[@id='form-order']//td[text()='Steve John']"));
		
		String customerName="Steve John";
		
		String xpathText="//form[@id='form-order']//td[text()='"+customerName+"']/preceding-sibling::td[3]";
		
		driver.findElement(By.xpath(xpathText)).click();

	}

}
