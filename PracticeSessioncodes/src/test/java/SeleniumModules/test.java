package SeleniumModules;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class test {

public static void main(String[] args) 
{
//connect to the site
String Url = "https://colored.lmscheckout.com/";
WebDriver driver= new FirefoxDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get(Url);
driver.manage().window().maximize();
//open featured courses page by clicking its link
driver.findElement(By.xpath("//a[@href='/Course/featuredCourse']")).click();
//get products with css class ellipsis
List products = driver.findElements(By.className("ellipsis"));
//display product count 
System.out.println("Count of Featured Courses page is:"+products.size() );
}
}