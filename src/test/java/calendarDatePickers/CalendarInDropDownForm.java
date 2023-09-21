package calendarDatePickers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarInDropDownForm {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		WebElement calendarField=driver.findElement(By.id("third_date_picker"));
		
		calendarField.click();
		
		WebElement monthDrop=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		
		Select s1=new Select(monthDrop);
		
		s1.selectByVisibleText("Aug");
		
		WebElement yearDrop=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		
		Select s2=new Select(yearDrop);
		
		s2.selectByVisibleText("2024");
		
		String xpathText="//table[@class='ui-datepicker-calendar']//td[@data-handler='selectDay']/a[.='12']";
		
		driver.findElement(By.xpath(xpathText)).click();
		
	}

}
