package Base;

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
	
	public TestBase() {
		
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream(System.getProperty("D:\\Scripts\\4195\\workspace\\OrangeHrms.pro.com\\src\\main\\java\\Config\\config.properties"));
			try {
				prop.load(ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void initilization(){
		String BrowserName = prop.getProperty("browser");{
			
			if( BrowserName.equals("chrome")){
				
				System.out.println("Chrome browser initiated");
				
				System.setProperty("webdriver.chrome.driver", "D:\\suresh backup\\chromedriver.exe");
				
				driver = new ChromeDriver();
			}
			else if(BrowserName.equals("FF")){
				
				System.setProperty("webdriver.gecko.driver", "D:\\Automation Data\\geckodriver.exe");
				
				driver = new FirefoxDriver(); 
				
				System.out.println("FireFox browser initiated");
				
				driver.manage().window().maximize();
				
				driver.manage().deleteAllCookies();
				
				//driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
				//driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.get(prop.getProperty("url"));
				
		}
	}
			
		}
	}
	
	


