package calendarDatePickers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarHandleGeneralMethod {
     
	static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();

		WebElement calendarDiv = driver.findElement(By.id("ui-datepicker-div"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.visibilityOf(calendarDiv));

		
		selectADate("31", "August", "2024");

		driver.quit();

	}

	public static void selectADate(String selectDay, String selectMonth, String selectYear) {
		
		if(Integer.parseInt(selectDay)>31) {
			System.out.println("Invalid date is entered"+selectDay+"/"+selectMonth+"/"+selectYear);
			return;
		}
		
		if(selectMonth.equals("February")&&Integer.parseInt(selectDay)>29) {
			System.out.println("Invalid date is entered"+selectDay+"/"+selectMonth+"/"+selectYear);
			return;
		}
		
		
		String monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();

		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];

		while (!(month.equals(selectMonth) && year.equals(selectYear))) {
			
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			
			monthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
			
			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];
		}
		
        //We need to make dynamic xpath which can change along with the day changes
		String xpathText="//td[@data-handler='selectDay']//a[.=\'"+selectDay+"\']";
		
		try {
			driver.findElement(By.xpath(xpathText)).click();
		}catch(Exception e) {
			
		}

	}

}
