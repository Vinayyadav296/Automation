package webDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		// We will add WebDriverManager dependency in order to match the versions of
		// browser and web driver

		String browserName = "chrome";

		WebDriver driver = null;

		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(); // chrome driver is a class and its object is pointed here by WebDriver
			// interface

		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver(); // chrome driver is a class and its object is pointed here by WebDriver
			// interface

		} else if (browserName.equalsIgnoreCase("chrome")) {
			driver = new EdgeDriver();

		}

		// launching the web browser
		driver.get("https://omayo.blogspot.com/");
		// maximizing the window
		driver.manage().window().maximize();

		// Finding ui element using id and clicking on it

//		WebElement alertA=driver.findElement(By.id("alert1"));
//		alertA.click();

		// Finding ui element using name

//		WebElement ipField=driver.findElement(By.name("q"));
//		ipField.sendKeys("JavaScript");

		// Holding the program execution for 5 seconds using sleep

		// Thread.sleep(3000); // we have add throws declaration here throws
		// InterruptedException

		// ui element have pre populated text in the text field clear that text field

//		WebElement clearIPBox = driver.findElement(By.id("textbox1"));
//		clearIPBox.clear();

		// ui element using class name

//		WebElement locateUsingClass=driver.findElement(By.className("classone"));
//	    locateUsingClass.sendKeys("Locate using class");

		// locating hyperlink using linkText()

//		WebElement hyperLink=driver.findElement(By.linkText("compendiumdev"));
//		hyperLink.click();

		// locating hyperlink using partialLinkText() it is same as linkeText() only
		// diff is we do not to provide the full name b/w anchor tags

//		WebElement hyperLink2=driver.findElement(By.partialLinkText("compendi"));
//		hyperLink2.click();

		// locating ui element using css selector

//		WebElement cssSelectorId = driver.findElement(By.cssSelector("#confirm"));
//		cssSelectorId.click();

		// locating ui element using xpath

//		WebElement xpathId=driver.findElement(By.xpath("//input[@id='confirm']"));
//	    xpathId.click();

		// Getting the text present on the ui

//		WebElement textPara=driver.findElement(By.id("pah"));
//	    String Para=textPara.getText();
//	    System.out.println(Para);

		// Getting the title of the page

//		String Title=driver.getTitle();
//		System.out.println(Title);

		// Getting the current url of the page

//		String URLHomePage=driver.getCurrentUrl();
//		System.out.println(URLHomePage);
//		
//		WebElement hyperLink=driver.findElement(By.linkText("compendiumdev"));
//		hyperLink.click();
//		String URLNextPage=driver.getCurrentUrl();
//		System.out.println(URLNextPage);

		// Closing the browser
		// driver.close(); //close has a disadvantage over quit it will not close the
		// child windows

//	WebElement popUP=driver.findElement(By.linkText("Open a popup window"));
//	popUP.click();
//	
//	WebElement blogWindow=driver.findElement(By.linkText("Blogger"));
//	blogWindow.click();
//	
//	//driver.close(); //This will not close the child window
//	driver.quit();

		// Getting the value present inside an attribute using getAttribute method
//		String attributeValue=driver.findElement(By.id("textbox1")).getAttribute("value");
//	    System.out.println(attributeValue);
//	    driver.quit();

		// Verify the element is displayed on ui or not
//	boolean buttonDisplayed=	driver.findElement(By.id("but2")).isDisplayed();
//	boolean buttonHidden=	driver.findElement(By.id("hbutton")).isDisplayed();
//	System.out.println(buttonDisplayed);
//	System.out.println(buttonHidden);

		// Verify the button is enabled or not using isEnabled()
//	boolean buttonEnabled=driver.findElement(By.id("but2")).isEnabled();
//	boolean buttonDisabled=driver.findElement(By.id("but1")).isEnabled();
//	System.out.println(buttonEnabled);
//	System.out.println(buttonDisabled);

		// Verify the checkbox is selected or not using isSelected()
//	boolean checkSelected=driver.findElement(By.id("checkbox1")).isSelected();
//	System.out.println(checkSelected);
//	driver.quit();

		// Navigating to new url or going forward or backward it is same as get()
//	driver.navigate().to("https://mvnrepository.com/search?q=seleinum");
//	Thread.sleep(2000);
//	driver.navigate().back();  //coming back to the original url
//	Thread.sleep(1000);
//	driver.navigate().forward();
//	Thread.sleep(1000);
//	driver.navigate().refresh();

		// Getting the page source code
//		String sourceCode=driver.getPageSource();
//	    System.out.println(sourceCode);
//	

		// Submit a form using submit() it is same as the click() only one difference
		// submit can be only used for forms not button clicking

		// Getting the name of the tag using getTagName()
//		String TagName=driver.findElement(By.id("drop1")).getTagName();
//	   System.out.println(TagName);

		// Getting the css value

//	String CssValue=driver.findElement(By.id("home")).getCssValue("text-align");
//	System.out.println(CssValue);

		// Getting the size of element using getSize() it will give height and width
//	Dimension d=driver.findElement(By.id("but1")).getSize();
//	System.out.println(d);
//	System.out.println("Height is "+d.height);
//	System.out.println("Witdth is "+d.width);
//	

		// Finding the x-y coordinate of element
//	Point p=	driver.findElement(By.id("but1")).getLocation();
//	System.out.println("x cooridnate is "+p.x);
//	System.out.println("y cooridnate is "+p.y);

		// Opening the browser in full screen mode

		// driver.manage().window().fullscreen();

		List<WebElement> elements = driver.findElements(By.tagName("a"));
//	for(WebElement e:elements) {
//		if(e.getText().length()>0)
//		System.out.println(e.getText());
//	}
//	}

		for (int i = 0; i < elements.size(); i++) {
			if (elements.get(i).getText().length() > 0)
				System.out.println(elements.get(i).getText());

		}
	}

}
