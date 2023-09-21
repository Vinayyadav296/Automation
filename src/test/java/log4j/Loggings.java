package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loggings {
    public static void main(String[] args) {
    	
		Logger log= LogManager.getLogger(Loggings.class.getName());
		
		log.debug("Demo Test execution started");
		
		WebDriver driver=new ChromeDriver();
		log.debug("Chrome browser launched");
		
		driver.manage().window().maximize();
		log.debug("browser got maximized");
		
		driver.get("https://omayo.blogspot.com/");
		log.info("navigated to omayo ");
		
		driver.findElement(By.linkText("jqueryui")).click();
		log.debug("Going on jquery site");
		
		driver.navigate().back();
		
		log.debug("navigated back to omayo ");
		
		if(driver.getTitle().equalsIgnoreCase("omay (QAFox.com)")) {
			log.info("Correct title of the page is displayed");
		}else {
			log.error("Wrong title of the page is displayed");
		}
		
		driver.quit();
		
		log.debug("Closing the browser");
	}
    
}
