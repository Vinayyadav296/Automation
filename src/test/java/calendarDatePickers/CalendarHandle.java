package calendarDatePickers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarHandle {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		WebElement calendarDiv=driver.findElement(By.id("ui-datepicker-div"));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOf(calendarDiv));
		
		String monthYear=driver.findElement(By.className("ui-datepicker-title")).getText();
		
//		String []my=monthYear.split(" ");
//		String month=my[0];
//		String year=my[1];
		
		//above code can be written like this
         String month=monthYear.split(" ")[0];
         String year=monthYear.split(" ")[1];
         
         while(!(month.equals("August") && year.equals("2024"))) {
        	 driver.findElement(By.xpath("//a[@title='Next']")).click();
        	 monthYear=driver.findElement(By.className("ui-datepicker-title")).getText();
        	 month=monthYear.split(" ")[0];
        	 year=monthYear.split(" ")[1];
         }
         
         driver.findElement(By.xpath("//td[@data-handler='selectDay']//a[.='12']")).click();
		
		driver.quit();
	
	}

}
