package calendarDatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruCalendar {
	
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://demo.guru99.com/test/");
			
			WebElement calendarField=driver.findElement(By.xpath("//input[@name='bdaytime']"));
			
			calendarField.sendKeys("12081994");
			
			calendarField.sendKeys(Keys.TAB);
			
			calendarField.sendKeys("730");
			
			driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}