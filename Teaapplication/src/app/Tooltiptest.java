package app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltiptest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suresh backup\\chromedriver.exe"); 

		// Initialize browser
		
		WebDriver driver=new ChromeDriver(); 
		

		// Open facebook
		
		/*driver.get("https://www.brobia.com"); 

		// Maximize browser

		driver.manage().window().maximize(); 
		
		
		String tooltiptext = driver.findElement(By.xpath("")).getAttribute("title");  
		
		System.out.println("Tooltip text is :"+ tooltiptext );  
		
		driver.close();  
		
		System.out.println();*/
		
		driver.get("http://demoqa.com/tooltip/");  
	    WebElement element = driver.findElement(By.xpath(".//*[@id='age']"));  
	    Actions toolAct = new Actions(driver);  
	    toolAct.moveToElement(element).build().perform(); 
	    WebElement toolTipElement = driver.findElement(By.cssSelector(".ui-tooltip"));  
	    String toolTipText = toolTipElement.getText();  
	    System.out.println(toolTipText);    
		
		
		

}
}