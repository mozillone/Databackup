package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		

		System.setProperty("webdriver.chrome.driver", "D:\\suresh backup\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.utest.com");
		
		driver.manage().window().maximize();
	}

}
