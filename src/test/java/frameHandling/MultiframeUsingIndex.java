package frameHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiframeUsingIndex {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://docs.oracle.com/javase/8/docs/api/");

		//First we will find the total no. of frames on the page
		
		 List<WebElement> frameList=driver.findElements(By.tagName("frame"));
		 
		 int noOfFrames=frameList.size();
		 
		 int idx=0;
		 
		 for(int i=1;i<=noOfFrames;i++) {
			 
			 //switching to the frame
			 driver.switchTo().frame(i);
			 
			 //checking that frame is the one which contains description web element on which we want to switch
			 int s=driver.findElements(By.linkText("Description")).size();
			 
			 if(s>0) {
				idx=i;
				driver.switchTo().parentFrame();
				break;
			 }
			 
			 driver.switchTo().parentFrame();
			 
		 }
        
		 driver.switchTo().frame(idx);
		 
		 driver.findElement(By.linkText("Description")).click();

	}

}
