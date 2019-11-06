package SeleniumModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\4195\\Downloads\\Changes\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.utest.com");
		
		driver.manage().window().maximize();
	}

}
