package testcases;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suresh backup\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		
		//Find no of frames in webpage through javascript
		
		/*JavascriptExecutor exe = (JavascriptExecutor) driver;
		Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
		System.out.println("No of iframes on the webpage are  "+ numberOfFrames);*/
		
		
		//Find no of frames in webpage with tagname
		
		/*List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
		System.out.println("No of iframes on the webpage are  "+ iframeElements.size());*/
		
		//Switch to frame By index
		
		       /*driver.switchTo().frame(0);
		       driver.findElement(By.linkText("Skip to content")).click();*/
		
		//Switch to frame By name
		
		        /*driver.switchTo().frame("iframe1");
		        driver.findElement(By.linkText("Skip to content")).click();*/
		
		//Switch to frame By Id
		
				/*driver.switchTo().frame("IF1");
				driver.findElement(By.linkText("Skip to content")).click();*/
				
		//Switch to frame By WebElement
		
				WebElement iframeElement = driver.findElement(By.id("IF1"));
				driver.switchTo().frame(iframeElement);
				driver.findElement(By.linkText("Skip to content")).click();
				
		
		
		//driver.quit();
	}

}
