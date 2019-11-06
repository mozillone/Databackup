package SeleniumModules;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOptions {
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\4195\\Downloads\\Version 76.0.3865.10\\chromedriver.exe");
		driver = new ChromeDriver();
		
        driver.get("http://compendiumdev.co.uk/selenium/basic_html_form.html");
		
		driver.manage().window().maximize();
		
		
		

		
		Select select = new Select(driver.findElement(By.name("multipleselect[]")));
		
		select.deselectAll();
		
		select.deselectByValue("ms1");
		select.deselectByValue("ms2");
		select.deselectByValue("ms3");
		
		
		
		//driver.findElement(By.cssSelector("textarea")).clear();
		
		List<WebElement> selected_list_options = select.getAllSelectedOptions();
		
		System.out.println(selected_list_options);
		
		//driver.close();
		
		

	}

}
