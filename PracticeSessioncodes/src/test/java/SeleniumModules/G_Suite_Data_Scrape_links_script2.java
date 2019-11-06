package SeleniumModules;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class G_Suite_Data_Scrape_links_script2 {

	static WebDriver driver;

	@BeforeClass
	public void beforeclass() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\4195\\Downloads\\Version 76.0.3865.10\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://cloud.withgoogle.com/partners/?products=GSUITE_PRODUCT&sort-type=RELEVANCE");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void Get_all_Business_names() throws InterruptedException, FileNotFoundException {
		/*System.setOut(new PrintStream(new FileOutputStream("Google.txt")));
		System.out.println("Links");*/
		
		
		while(true){
			
			List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='card']//a"));
			//List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			
			for (WebElement link : allLinks) {
				System.out.println(link.getText() + " - " + link.getAttribute("href"));
				
				
				
				System.out.println("***********************************************************************************************");
				
				Thread.sleep(2000);
		
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			//WebElement Element = driver.findElement(By.xpath("//span[contains(text(),'Load more partners')]"));
			WebElement Element = driver.findElement(By.id("load-more-cards-button"));
			
			//WebElement Element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/section/div[13]/button/span"));
			
			
			Thread.sleep(2000);
			
			//Boolean isPresent = driver.findElements(By.xpath("//span[contains(text(),'Load more partners')]")).size() > 0;
			
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)", Element);
			
			if (Element.isDisplayed()) {
				Element.click();
			}else
				System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'The Dealio LLC')]")).getText());
			
			
			
				//Element.click();
			Thread.sleep(2000);
			
			
		}
		
		
		int linkCount = allLinks.size();     // Count the total Link list on Web Page
        
        System.out.println("Total Number of link count on webpage = "  + linkCount);

	}
	}

	/*
	 * List<WebElement> resultsList =
	 * driver.findElements(By.xpath("//div[@class='card']//h3"));
	 * 
	 * for (WebElement result:resultsList) {
	 * System.out.println(result.getText()); }
	 */

	/*
	 * String businessname = driver.findElement(By.xpath(
	 * "/html[1]/body[1]/div[3]/div[2]/div[1]/section[1]/div[6]/a[1]/div[1]/h3[1]"
	 * )).getText();
	 * 
	 * System.out.println(businessname);
	 */

	/*@AfterClass
	public void Afterclass() {
		// TODO Auto-generated method stub
		driver.quit();*/

	
}

