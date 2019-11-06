package app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManagerTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suresh backup\\chromedriver.exe");

		// Initialize browser
		WebDriver driver=new ChromeDriver();
		

		// Open facebook
		driver.get("http://www.facebook.com");

		// Maximize browser

		driver.manage().window().maximize();
		
		System.out.println("test executed successfully");
		driver.get("http://www.google.com/");
		  System.out.println(driver.getTitle());
		  driver.close();

		}

		}

4375514082209007


prop = new properties();

FileInputStream ip = new FileInputStream(System.getproperty());

prop.load(ip);

