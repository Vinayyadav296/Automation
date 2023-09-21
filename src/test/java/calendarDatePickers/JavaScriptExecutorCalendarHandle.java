package calendarDatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorCalendarHandle {
	
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
			
			//WebElement calendarIpBox = driver.findElement(By.id("datepicker"));
			
			JavascriptExecutor js=((JavascriptExecutor)driver);
			
		    js.executeScript("document.getElementById('datepicker').value='08/12/1994'");
			
			//js.executeScript("arguments[0].value='08/12/1994'",calendarIpBox);
			
			
	}

}
