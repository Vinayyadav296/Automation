package actionsOfSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumAction {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		
		Actions actions=new Actions(driver);
		
		WebElement blogMenu = driver.findElement(By.xpath("//span[@id='blogsmenu']"));
		
		actions.moveToElement(blogMenu).perform();
		
		WebElement menuItem2=driver.findElement(By.xpath("//span[.='SeleniumByArun']"));
		
		actions.moveToElement(menuItem2).click().build().perform();
	}

}
