package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 

public class TestBase {
	
	public static WebDriver driver; 
	public static Properties prop; 
	
	public TestBase(){
		
		prop = new Properties(); 
		try {
			
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/config/Config.properties"); 
				prop.load(ip);
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
	}
	
	public static void initilizatation(){
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\4195\\Downloads\\Version 76.0.3865.10\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equals("Firefox")){
			System.setProperty("", "");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
	}

}
