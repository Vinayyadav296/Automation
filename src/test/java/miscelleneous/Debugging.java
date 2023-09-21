package miscelleneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debugging {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		
		driver.findElement(By.linkText("Login")).click();
		
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("vinayyadav@gmail.com");
		
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Vinay@321");
		
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

}
