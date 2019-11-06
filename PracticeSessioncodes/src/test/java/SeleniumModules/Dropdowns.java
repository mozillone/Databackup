package SeleniumModules;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	
	static WebDriver driver;
	
	public static void main(String []args){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\4195\\Downloads\\Version 76.0.3865.10\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		
		driver.manage().window().maximize();
		
		try{
			Select dropdown = new Select(driver.findElement(By.id("testingdropdown")));
			//Select oSelect = new Select(driver.findElement(By.id("yy_date_8")));
			
			// will get all the options of the dropdownbox
			 List <WebElement> elementCount = dropdown.getOptions();
			 int iSize = elementCount.size();
			 
			 for(int i =0; i<iSize ; i++){
			 String sValue = elementCount.get(i).getText();
			 System.out.println(sValue);
			 }
			 
			dropdown.selectByVisibleText("Performance Testing");
			
			System.out.println("Dropdown value selected");
		}
		catch(Exception e){
			System.out.println("Dropdown Value not selected");
		}
		
		/*Select dropdown = new Select(driver.findElement(By.id("testingropdown")));
		dropdown.selectByVisibleText("Performance Testing");*/
		
		driver.findElement(By.id("male")).click();
		
	    driver.findElement(By.xpath("/html/body/div[1]/div[12]/div/p[1]/button")).click();
		
		
		Alert alert = driver.switchTo().alert();
		
		String print = alert.getText();
		
		System.out.println(print);
		
		//alert.accept();
		alert.dismiss();
		
       // WebElement buttontext=	driver.findElement(By.xpath("//*[text()='You pressed OK!']"));
		
		WebElement buttontext=	driver.findElement(By.xpath("//*[text()='You pressed Cancel!']"));
		
		String buttontextopt = buttontext.getText();
		
		System.out.println(buttontextopt);
		//System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[11]/div/p/button")).getText());
		
		driver.findElement(By.xpath("/html/body/div[1]/div[11]/div/p/button")).click();
		
        Alert alert2 = driver.switchTo().alert();
		
		String print2 = alert2.getText();
		
		System.out.println(print2);
		
		alert.accept();
				
				
		
		driver.quit();
	}

}
