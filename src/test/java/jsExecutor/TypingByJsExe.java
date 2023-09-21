package jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypingByJsExe {
    
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.opencart.com/");
		
		WebElement searchBox=driver.findElement(By.name("search"));
		
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		
//		js.executeScript("arguments[0].value='HP'", searchBox);
		
		type(driver, searchBox, "IPhone");
		
	}
	
	public static void type(WebDriver driver,WebElement element,String searchText) {
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		
		js.executeScript("arguments[0].value='"+searchText+"'", element);
		
	}
}
