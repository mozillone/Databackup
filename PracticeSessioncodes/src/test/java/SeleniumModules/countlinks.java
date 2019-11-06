package SeleniumModules;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class countlinks {
	
	static WebDriver driver;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\4195\\Downloads\\Version 76.0.3865.10\\chromedriver.exe");
          //driver.get("http://findnerd.com");
          
          driver.navigate().to("http://findnerd.com");
          
          List<WebElement> links = driver.findElements(By.xpath("//a"));    //Identify the number of Link on webpage and assign into Webelement List 
          
          int linkCount = links.size();     // Count the total Link list on Web Page
          
          System.out.println("Total Number of link count on webpage = "  + linkCount);    //Print the total count of links on webpage
          
          List<WebElement> allElements = driver.findElements(By.xpath("//*"));      //Identify all the elements on web page
          
          int elementsCount = allElements.size();     //Count the total all element on web page
          
          System.out.println("Total Number of All Element on webpage = "  + elementsCount);         //Print the total count of all element on webpage
          
                   
    }
}
