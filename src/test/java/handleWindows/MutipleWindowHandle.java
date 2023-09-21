package handleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutipleWindowHandle {
	
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		String ParentId=driver.getWindowHandle();
		WebElement newWindow=driver.findElement(By.id("newWindowBtn"));
		newWindow.click();
		
		driver.findElement(By.id("newTabBtn")).click();
		
		
		
		Set<String>allWindowId=driver.getWindowHandles();
		
		for(String id:allWindowId) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains("Basic Controls")) {
				driver.findElement(By.id("registerbtn")).click();
			    driver.close();
			}
			
//			if(driver.getTitle().contains("AlertsDemo")) {
//				driver.findElement(By.id("alertBox")).click();
//				Thread.sleep(1000);
//			    driver.close();
//			}

		}
		driver.switchTo().window(ParentId);
		driver.findElement(By.id("name")).sendKeys("Vinay yadav");
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
