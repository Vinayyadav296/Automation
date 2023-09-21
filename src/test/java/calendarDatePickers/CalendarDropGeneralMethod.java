package calendarDatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarDropGeneralMethod {
	
	static WebDriver driver;
	public static void main(String[] args) {
		 driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		selectDateInCalendar("20", "Dec", "2023");

		

	}
	
	public static void selectDateInCalendar(String day,String month,String year) {
		
		WebElement calendarField = driver.findElement(By.id("third_date_picker"));

		calendarField.click();

		WebElement monthDrop = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

		Select s1 = new Select(monthDrop);

		s1.selectByVisibleText(month);

		WebElement yearDrop = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));

		Select s2 = new Select(yearDrop);

		s2.selectByVisibleText(year);

		String xpathText = "//table[@class='ui-datepicker-calendar']//td[@data-handler='selectDay']/a[.=\'"+day+"\']";

		driver.findElement(By.xpath(xpathText)).click();
		
	}

}
