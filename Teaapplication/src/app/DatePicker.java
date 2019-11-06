package app;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\suresh backup\\chromedriver.exe");

		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://www.redbus.in/"); 
		
		//driver.findElement(By.xpath(".//*[@id='txtReturnCalendar']")).click();
		//driver.findElement(By.id("return_cal")).click();
		//driver.findElement(By.cssSelector("#return_cal")).click(); 
		driver.findElement(By.id("onward_cal")).click();
	
		Thread.sleep(2000); 
		
	    List<WebElement> dates=driver.findElements(By.xpath(".//*[@id='rbcal_txtReturnCalendar']/table[2]//td"));
		
		for(int i=0;i<dates.size();i++)
		{
			
			 WebElement futuredate=dates.get(i); 
			
			 String date=futuredate.getText(); 
			 
			 if(date.equalsIgnoreCase("30"))
			 {
				 futuredate.click(); 
				 break;
			 }
			 
			 driver.quit(); 
		}
		
		
	}

}