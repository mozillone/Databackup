package app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Implicitly_Explicitly_Wait_Examples {
	static WebDriver driver;
	
	
	
	public static void main(String[]args){
		System.setProperty("webdriver.chrome.driver", "D:\\suresh backup\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		String eTitle = "Google";
		String aTitle = "Google";
		
		aTitle = driver.getTitle();
		
		if (aTitle.equals(eTitle)){
			System.out.println("Test Passed");
			
		}else{
			System.out.println("Test Failed");
		}
		
	}

}
