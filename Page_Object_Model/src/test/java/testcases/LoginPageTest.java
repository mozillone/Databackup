package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import junit.framework.Assert;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends TestBase {

	
	LoginPage loginpage; 
	HomePage homepage; 
	
	public LoginPageTest(){
		super(); 
	}

	@BeforeMethod
	public void setup() {
		initilizatation(); 
		loginpage = new LoginPage(); 

	}
    @Test(priority=0)
    public void loginpageTitleTest(){
    	
    	String title = loginpage.validateLoginPageTitle(); 
    	Assert.assertEquals(title, "OrangeHRM"); 
    }
    
    @Test(priority=1)
    public void HrmsLogoTest(){
    	boolean flag = loginpage.validateHrmsLogo(); 
    	Assert.assertTrue(flag); 
    }
    @Test(priority=2)
    public void loginTest() throws InterruptedException{
    	homepage = loginpage.Login(prop.getProperty("username"),prop.getProperty("password")); 
    	Thread.sleep(10000); 
    	String Actualurl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard"; 
    	String Expectedurl = driver.getCurrentUrl(); 
    	
    	Assert.assertEquals(Expectedurl, Actualurl); 
    
    	
    }
    
    @AfterMethod
    public void tearDown(){
    	driver.quit(); 
    }
	
    
}