package calendarDatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarDropSecond {
	
	static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		selectDateInCalendar("25", "Mar", "2024");

		

	}
	
	public static void selectDateInCalendar(String day,String month,String year) {
		
		WebElement calendarField = driver.findElement(By.id("fourth_date_picker"));

		calendarField.click();

		WebElement monthDrop = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

		Select s1 = new Select(monthDrop);

		s1.selectByVisibleText(month);

		WebElement yearDrop = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));

		Select s2 = new Select(yearDrop);

		s2.selectByVisibleText(year);

		String xpathText = "//td[not(contains(@class,' ui-datepicker-other-month '))]/a[text()=\'"+day+"\']";

		driver.findElement(By.xpath(xpathText)).click();
		
	}

}
