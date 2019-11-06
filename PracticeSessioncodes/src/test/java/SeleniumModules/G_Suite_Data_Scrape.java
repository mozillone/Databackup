package SeleniumModules;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class G_Suite_Data_Scrape {

	static WebDriver driver;

	@BeforeClass
	public void beforeclass() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\4195\\Downloads\\Version 76.0.3865.10\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://cloud.withgoogle.com/partners/?products=GSUITE_PRODUCT&sort-type=RELEVANCE"); 

		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	}
	
	@Test
	public void Get_all_Business_names() throws InterruptedException, FileNotFoundException {
		/*System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		System.out.println("Business Names");*/
		//load-more-cards-button
		int num=1;
		while(num<=3){
        //List<WebElement> resultsList = driver.findElements(By.xpath("//div[@class='card']//h3"));
			List<WebElement> resultsList = driver.findElements(By.xpath("//div[@class='card']//a/@href"));
		for (WebElement result:resultsList) {
            System.out.println(result.getText());
            
		}
		  System.out.println("**************************");
        num=num+1;

		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		WebElement Element = driver.findElement(By.xpath("//span[contains(text(),'Load more partners')]"));

		Thread.sleep(2000);

		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		Element.click();
		
		
		
		Thread.sleep(2000);
		
		
		

			}
		
		} 
		
		/*List<WebElement> resultsList = driver.findElements(By.xpath("//div[@class='card']//h3"));
		
		for (WebElement result:resultsList) {
            System.out.println(result.getText());
		}*/
		
	/*String	businessname = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/section[1]/div[6]/a[1]/div[1]/h3[1]")).getText();
		
		System.out.println(businessname);*/
        
		   
		       
		
				
	

	@AfterClass
	public void Afterclass() {
		// TODO Auto-generated method stub
		driver.quit();
		
	}

	

	
	}
