package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompts {
	
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
		
		Alert a=driver.switchTo().alert();
		a.sendKeys("Hii my name is vinay");
		a.accept();
		String result=driver.findElement(By.id("result")).getText();
	    System.out.println(result);
	    driver.quit();
		
		
	}
	
	
	

}
