package SeleniumModules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DisplayProductNames {

public static String StartString=null;
 public static String EndString=null;


 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\4195\\Downloads\\Version 76.0.3865.10\\chromedriver.exe");
     WebDriver myTestDriver=new ChromeDriver();
// WebDriver myTestDriver = new FirefoxDriver();
 myTestDriver.manage().window().maximize();

myTestDriver.navigate().to("https://cloud.withgoogle.com/partners/?products=GSUITE_PRODUCT&sort-type=RELEVANCE");

StartString = "/html[1]/body[1]/div[3]/div[2]/div[1]/section[1]/div[1]/a[1]" ;
        EndString =    "/div[1]/h3[1]";
// EndString = "]/div[3]/b/a";

 for(int i=1;i<=35;i++){
   
System.out.println(myTestDriver.findElement(By.xpath(StartString + i + EndString)).getText());


//System.out.println(myTestDriver.findElement(By.xpath(StartString + i + EndString)).getSize());
 //System.out.println(myTestDriver.findElement(By.xpath(StartString + i + EndString)).getAttribute("href"));;

 }

 myTestDriver.quit();

 }

}
