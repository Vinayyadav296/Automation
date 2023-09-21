package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalDialogHandling {
	
	//No need to use alert handling because we can inspect modal dialog
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
			driver.get("https://getbootstrap.com/docs/4.0/components/modal/");
			
			driver.findElement(By.xpath("(//div[@class='bd-example'])[1]//button")).click();
	        
			driver.findElement(By.xpath("(//button[.='Close'])[2]")).click();
			
			driver.quit();
	}

}
