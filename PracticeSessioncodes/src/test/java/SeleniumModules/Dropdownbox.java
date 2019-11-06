package SeleniumModules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dropdownbox {

	static WebDriver driver;

	@BeforeClass
	public void beforeclass() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\4195\\Downloads\\Version 76.0.3865.10\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com"); 

		driver.manage().window().maximize(); 
	}

	@Test
	public void Get_all_options_from_dropdown() {
		
		WebDriverWait wait = new WebDriverWait(driver,5); 
		
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("day")));
        
		
		
		WebElement day_dropdown = driver.findElement(By.id("day")); 

		Select day = new Select(day_dropdown); 

		List<WebElement> dropdown = day.getOptions(); 

		for (int i = 0; i < dropdown.size(); i++) {

			String drop_down_values = dropdown.get(i).getText(); 

			System.out.println("Dropdown values are " + drop_down_values);  

		}
	}

	@Test
	public void Get_first_selected_option_from_dropdown() {

		WebElement month_dropdown = driver.findElement(By.id("month")); 

		Select month = new Select(month_dropdown); 

		WebElement first_Selected_value = month.getFirstSelectedOption(); 

		String value = first_Selected_value.getText(); 

		System.out.println("The first selected month is " + value); 

	}

	@Test
	public void select_by_visibletext() {

		WebElement year_dropdown = driver.findElement(By.id("month")); 

		Select year = new Select(year_dropdown); 

		year.selectByVisibleText("Apr"); 
	}

	@Test
	public void select_by_index() {
		WebElement year_dropdown = driver.findElement(By.id("month")); 

		Select year = new Select(year_dropdown); 

		year.selectByIndex(3); 

	}

	@Test
	public void select_by_value() {
		WebElement year_dropdown = driver.findElement(By.id("month")); 

		Select year = new Select(year_dropdown); 

		year.selectByValue("6"); 
		
		
	}

	/*@AfterClass
	public void afterclass() {

		driver.quit(); 

	}*/

}
