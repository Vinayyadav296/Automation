package frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		//Handling the iframe using the id attribute there are certain other method also
		
		driver.switchTo().frame("mce_0_ifr");
		
		driver.findElement(By.xpath("//body[@id='tinymce']/p")).clear();
		driver.findElement(By.xpath("//body[@id='tinymce']/p")).sendKeys("Vinay Yadav");
	}
	
	

}
