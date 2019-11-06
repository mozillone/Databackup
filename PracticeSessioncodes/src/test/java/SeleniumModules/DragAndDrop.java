package SeleniumModules;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.interactions.Actions; 
import org.testng.annotations.AfterClass; 
import org.testng.annotations.BeforeClass; 
import org.testng.annotations.Test; 

public class DragAndDrop {

	static WebDriver driver; 

	@BeforeClass
	public void beforeclass() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\4195\\Downloads\\Version 76.0.3865.10\\chromedriver.exe"); 

		driver = new ChromeDriver(); 

		driver.manage().window().maximize(); 

	}

	@Test(priority = 3)
	public void draganddrop() throws InterruptedException {

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");

		Thread.sleep(2000l); 

		Actions act = new Actions(driver); 

		WebElement drag = driver.findElement(By.id("draggable")); 

		WebElement drop = driver.findElement(By.id("droppable")); 

		act.dragAndDrop(drag, drop).build().perform(); 

	}

	@Test(priority = 1)

	public void usingXYcordinates() throws InterruptedException {

		driver.get("http://jqueryui.com/resources/demos/droppable/default.html"); 
		
		//driver.switchTo().frame(0);

		Thread.sleep(2000l); 

		Actions act = new Actions(driver); 
		
		WebElement drag = driver.findElement(By.id("draggable")); 
		
		int x = drag.getLocation().getX(); 
		int y = drag.getLocation().getY(); 
		
		act.dragAndDropBy(drag, 250, 150); 

	}
	
	@Test(priority = 0)
	public void usingclickandHold() throws InterruptedException{
		
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/"); 
		
		Thread.sleep(2000); 
		
		//driver.switchTo().frame(0);
		
		Actions act = new Actions(driver); 
		
		WebElement source = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[1]/section/div[1]/div[1]/div/div[2]/ul/li[1]/ul/li[1]/ul/li/div/span"));
		
		WebElement destination = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[1]/section/div[1]/div[2]/div/div[2]/ul")); 
		
		Thread.sleep(2000); 
		
		act.clickAndHold(source).pause(2000).moveToElement(destination).release().build().perform();
		
		Thread.sleep(2000); 
		
		/*BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));

		ImageIO.write(image, “png”, new File(“c:\localdev\bla.png”));*/
		
		
	}

	@AfterClass
	public void afterclass() {

		driver.quit(); 
	}

}
