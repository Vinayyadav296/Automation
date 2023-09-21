package calendarDatePickers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//this calendar has previous month dates and current months dates together 
public class CalendarPrevCurrMonthDates {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.path2usa.com/travel-companion/");

		WebElement calendarField=driver.findElement(By.xpath("//input[@placeholder='Date of travel']"));
		
	     JavascriptExecutor js=((JavascriptExecutor)driver);
	     js.executeScript("arguments[0].click()", calendarField);

		WebElement calendarDiv = driver.findElement(By.xpath("//div[@class='flatpickr-calendar animate open arrowBottom']"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.visibilityOf(calendarDiv));

		selectADate("32", "August", "2024");

		driver.quit();

	}

	public static void selectADate(String selectDay, String selectMonth, String selectYear) {

		if (Integer.parseInt(selectDay) > 31) {
			System.out.println("Invalid date is entered" + selectDay + "/" + selectMonth + "/" + selectYear);
			return;
		}

		if (selectMonth.equals("February") && Integer.parseInt(selectDay) > 29) {
			System.out.println("Invalid date is entered" + selectDay + "/" + selectMonth + "/" + selectYear);
			return;
		}

		String monthYear = driver.findElement(By.className("flatpickr-current-month")).getText();

		String month = monthYear.split(" ")[0];
		String year = monthYear.split(" ")[1];

		while (!(month.equals(selectMonth) && year.equals(selectYear))) {

			driver.findElement(By.xpath("//span[@class='flatpickr-next-month']")).click();

			monthYear = driver.findElement(By.className("flatpickr-current-month")).getText();

			month = monthYear.split(" ")[0];
			year = monthYear.split(" ")[1];
		}

		// We need to make dynamic xpath which can change along with the day changes
		String xpathText = "//div[@class='dayContainer']//span[@class='flatpickr-day today selected' or @class='flatpickr-day nextMonthDay'][text()=\'"
				+ selectDay + "\']";

		try {
			driver.findElement(By.xpath(xpathText)).click();
		} catch (Exception e) {

		}

	}

}
