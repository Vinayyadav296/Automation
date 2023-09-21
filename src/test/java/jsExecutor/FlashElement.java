package jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		
		WebElement cartBtn = driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block dropdown-toggle']"));
		 
		String defaultColor=cartBtn.getCssValue("background-color");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		for(int i=0;i<15;i++) {
			
			js.executeScript("document.querySelector('button.btn.btn-inverse.btn-block.dropdown-toggle').style.background='green'");
			
			Thread.sleep(1000);
			
			js.executeScript("document.querySelector('button.btn.btn-inverse.btn-block.dropdown-toggle').style.background='"+defaultColor+"'");
			
		}
		
	}
}
