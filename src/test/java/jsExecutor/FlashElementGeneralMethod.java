package jsExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashElementGeneralMethod {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		
		WebElement cartBtn = driver.findElement(By.xpath("//button[@class='btn btn-inverse btn-block dropdown-toggle']"));
		 
	    	flashElement(driver, cartBtn);
		
	}

   public static void flashElement(WebDriver driver,WebElement element) {
	   
	   String defaultColor=element.getCssValue("background-color");
	   
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		
            for(int i=0;i<15;i++) {
			
			js.executeScript("arguments[0].style.background='green';",element);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			js.executeScript("arguments[0].style.background='"+defaultColor+"'",element);
			
		}
		
		
	   
	   
   }

}
